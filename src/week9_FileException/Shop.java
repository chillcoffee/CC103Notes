package week9_FileException;

import java.io.*;
import java.util.*;

public class Shop implements FileHandler {

    ArrayList<Product> allProd = new ArrayList();
    ArrayList<String> salesRecord = new ArrayList();
    String packageName = this.getClass().getPackageName();

    @Override
    public void readFile(String filename) {

        String path = System.getProperty("user.dir");
        filename = "\\src\\" + packageName + "\\" + filename;
        System.out.println(path + filename);
        try {
            File file = new File(path + filename);
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                String line = reader.nextLine();
                Product p = new Product(line);
                allProd.add(p);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }

    @Override
    public void writeFile(String filename, ArrayList<String> record) {
        String path = System.getProperty("user.dir");
        filename = "\\src\\" + packageName + "\\" + filename;
        try{
            FileWriter writer = new FileWriter(path+filename);
            
            for(String r: record){
                writer.write(r);
            }
            writer.close();
            System.out.println("Sales record saved.");
        }catch(IOException e){
            System.out.println("File not found.");
        }

    }

    public static void main(String[] args) {
        Shop sh = new Shop();
        sh.readFile("items.txt");
        sh.showMenu();
        sh.calculatePayment(sh.acceptOrder());
        
    }

    public void showMenu() {
        ItemManager mgr = new ItemManager();
        mgr.setPriceForAll(allProd);
        System.out.println("\nWelcome to My Shop");
        int ctr = 1;
        for (Product p : allProd) {
            System.out.println(ctr + ". " + p.getProductName() + "\t\t" + format(p.getPrice()));
            ctr++;
        }
    }

    public String format(double price) {
        return String.format("%.2f", price);
    }

    public Product acceptOrder() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nChoose an item to buy: ");
        int ch = s.nextInt();
        return allProd.get(ch - 1);
    }

    public void calculatePayment(Product chosenItem) {
        System.out.println(chosenItem.getProductName());
        Scanner s = new Scanner(System.in);
        System.out.print("Amount tendered: ");
        double received = s.nextDouble();
        double change = received - chosenItem.getPrice();
        System.out.println("Change: " + change);
        System.out.println("Thank you. Come again.");
        
        recordSales(chosenItem, 1);
        writeFile("sales.txt", salesRecord);
    }

    public void recordSales(Product chosenItem, int quantity) {
        salesRecord.add(chosenItem.getProductName()+"\t| "+format(chosenItem.getPrice())+"\t|"+quantity);
        
    }

}
