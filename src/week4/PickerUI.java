package week4;


public class PickerUI extends javax.swing.JFrame {

    public PickerUI() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPickKeyword = new javax.swing.JButton();
        btnPickKeyword1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();
        lblInstructions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPickKeyword.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        btnPickKeyword.setText("Pick a Keyword");
        btnPickKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickKeywordActionPerformed(evt);
            }
        });

        btnPickKeyword1.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        btnPickKeyword1.setText("Next Student");
        btnPickKeyword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickKeyword1ActionPerformed(evt);
            }
        });

        txtInstructions.setEditable(false);
        txtInstructions.setColumns(20);
        txtInstructions.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        txtInstructions.setForeground(new java.awt.Color(51, 102, 255));
        txtInstructions.setLineWrap(true);
        txtInstructions.setRows(5);
        txtInstructions.setText("Keywords will appear here...");
        txtInstructions.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtInstructions);

        lblInstructions.setText("Click the buttons below to randomly generate keyword and student.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPickKeyword1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblInstructions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblInstructions)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPickKeyword1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickKeywordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPickKeywordActionPerformed

    private void btnPickKeyword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickKeyword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPickKeyword1ActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPickKeyword;
    private javax.swing.JButton btnPickKeyword1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JTextArea txtInstructions;
    // End of variables declaration//GEN-END:variables
}
