package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class PickerUI extends javax.swing.JFrame {
    
    LinkedList words = new LinkedList();
    LinkedList students = new LinkedList();
    
    String currentWord, currentStudent;
    
    public PickerUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jspKeywords = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();
        lblInstructions = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        btnPickStudent = new javax.swing.JButton();
        txtStudent = new javax.swing.JLabel();
        txtKeyword = new javax.swing.JLabel();
        btnPickKeyword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pick Your Keyword");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        txtInstructions.setEditable(false);
        txtInstructions.setColumns(20);
        txtInstructions.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        txtInstructions.setForeground(new java.awt.Color(153, 153, 153));
        txtInstructions.setLineWrap(true);
        txtInstructions.setRows(5);
        txtInstructions.setText("Keywords will appear here...");
        txtInstructions.setAutoscrolls(false);
        jspKeywords.setViewportView(txtInstructions);

        lblInstructions.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        lblInstructions.setText("Click the buttons below to randomly generate keyword and student.");

        btnLoad.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnLoad.setText("Load All");
        btnLoad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnPickStudent.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnPickStudent.setText("Next Student");
        btnPickStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPickStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickStudentActionPerformed(evt);
            }
        });

        txtStudent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        txtKeyword.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        btnPickKeyword.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        btnPickKeyword.setText("Pick a Keyword");
        btnPickKeyword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPickKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickKeywordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblInstructions)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jspKeywords)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(txtKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnPickStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPickStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        words.clear();
        students.clear();
        loadFile("words.txt", words);
        loadFile("students.txt", students);
        btnLoad.setEnabled(false);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnPickStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickStudentActionPerformed
        // TODO add your handling code here:
        txtStudent.setText("Next Student");
        Collections.shuffle(students);
        currentWord = students.get(0).toString();
    }//GEN-LAST:event_btnPickStudentActionPerformed

    private void btnPickKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickKeywordActionPerformed
        // TODO add your handling code here:
        txtKeyword.setText("Next Keyword");
        Collections.shuffle(words);
        currentWord = words.get(0).toString();
    }//GEN-LAST:event_btnPickKeywordActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnPickKeyword;
    private javax.swing.JButton btnPickStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jspKeywords;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JTextArea txtInstructions;
    private javax.swing.JLabel txtKeyword;
    private javax.swing.JLabel txtStudent;
    // End of variables declaration//GEN-END:variables

    private void loadFile(String filename, LinkedList list) {
        try {
            File file = new File(filename); // file path
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        
        for (Object word : list) {
            System.out.println(word.toString());
        }
    }
}
