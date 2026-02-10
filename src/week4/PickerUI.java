package week4;


public class PickerUI extends javax.swing.JFrame {

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
        btnPickKeyword = new javax.swing.JButton();
        btnPickStudent = new javax.swing.JButton();
        txtStudent = new javax.swing.JLabel();
        txtKeyword = new javax.swing.JLabel();

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

        btnPickKeyword.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        btnPickKeyword.setText("Pick a Keyword");
        btnPickKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickKeywordActionPerformed(evt);
            }
        });

        btnPickStudent.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N
        btnPickStudent.setText("Next Student");
        btnPickStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickStudentActionPerformed(evt);
            }
        });

        txtStudent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        txtKeyword.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

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
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPickStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPickStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPickKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void btnPickKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickKeywordActionPerformed
        // TODO add your handling code here:
        txtKeyword.setText("Next Keyword");
    }//GEN-LAST:event_btnPickKeywordActionPerformed

    private void btnPickStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickStudentActionPerformed
        // TODO add your handling code here:
        txtStudent.setText("Next Student");
    }//GEN-LAST:event_btnPickStudentActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPickKeyword;
    private javax.swing.JButton btnPickStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jspKeywords;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JTextArea txtInstructions;
    private javax.swing.JLabel txtKeyword;
    private javax.swing.JLabel txtStudent;
    // End of variables declaration//GEN-END:variables
}
