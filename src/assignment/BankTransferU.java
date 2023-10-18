package assignment;

import javax.swing.JOptionPane;
import java.util.Random;
import static assignment.MonitorTreeU.ID;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowEvent;



public class BankTransferU extends javax.swing.JFrame {

    
    public static String randomString = "";
    public static String amount;
   
    
    
    public BankTransferU() {
        initComponents();
        jPay1.setText(amount);
        
    }

    public void payment(){
    String selectedValue = BankComboBox.getSelectedItem().toString();
        String BankNo = jtxtAccountNo.getText();
        String BankName = jtxtAccountName.getText();
      
        String Char_list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String randomString ="";
        int length3 = 6;
        
        Random rand = new Random();
        
        char[] text = new char[length3];
        
        for(int i=0; i < length3; i++){
            text[i] = Char_list.charAt(rand.nextInt(Char_list.length()));
            randomString += text[i];
        }
        
        
        int banknoLength = BankNo.length();
        do{
            try{
                Long bankno = Long.parseLong(BankNo);
                if(banknoLength != 12 || BankName.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter again.");
                break;
                }
                
                else{
                 int confirm = JOptionPane.showConfirmDialog(null,"Are the information given correct?"+ "\n" 
                              + "Bank: "+ selectedValue + "\n"
                              + "Bank number: "+BankNo+"\n"
                              + "Bank Name: "+BankName+"\n"
                              + "Payment: $"+ amount,
                              "Transaction Confirmation", JOptionPane.YES_NO_OPTION);
                       if (confirm == JOptionPane.NO_OPTION){
                      JOptionPane.showMessageDialog(null,"Write the information again");
                      break;
                      
                      }

                    else if (confirm == JOptionPane.YES_OPTION) {
                        String[] option = {"Copy to Clipboard", "OK"};
                       int x= JOptionPane.showOptionDialog(null, "Thank you!" + "\n"
                     + "Your tree ID is:" + randomString, "Donate Completed", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
                    
                       switch (x){
                           
                           case 0:
                                StringSelection stringSelection = new StringSelection(randomString);
                                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                clipboard.setContents(stringSelection, null);
                                JOptionPane.showMessageDialog(null, "Copied");
                                break;
                                
                           case 1:
                               break;
                       }
                       
                    CardU CardU = new CardU();
                    ID[CardU.IDindex][0] = randomString;
                    ID[CardU.IDindex][1] = "";
                    CardU.IDindex++;
                    randomString = "";
                    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
                    break;
                }
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter digit only.");
                break;
            }
        }while(true);
    }
   
         
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        DirectoryLabel1 = new javax.swing.JLabel();
        BankComboBox = new javax.swing.JComboBox<>();
        DirectoryLabel2 = new javax.swing.JLabel();
        jtxtAccountNo = new javax.swing.JTextField();
        jtxtAccountName = new javax.swing.JTextField();
        DirectoryLabel3 = new javax.swing.JLabel();
        DirectoryLabel4 = new javax.swing.JLabel();
        DirectoryLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DirectoryLabel6 = new javax.swing.JLabel();
        jPay = new javax.swing.JLabel();
        jPay1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setText("Bank Transfer");

        DirectoryLabel1.setText("Select Bank : ");

        BankComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maybank", "Public Bank", "CIMB Bank", "Hong Leong Bank", "Affin Bank" }));

        DirectoryLabel2.setText("Bank Account:");

        jtxtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAccountNoActionPerformed(evt);
            }
        });

        jtxtAccountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAccountNameActionPerformed(evt);
            }
        });

        DirectoryLabel3.setText("Account Name:");

        DirectoryLabel4.setText("Payable Amount: ");

        DirectoryLabel5.setText("USD");

        jButton1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DirectoryLabel6.setText("(12 digits only)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DirectoryLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(DirectoryLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DirectoryLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DirectoryLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BankComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtAccountNo)
                            .addComponent(jtxtAccountName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DirectoryLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPay1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jPay, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(DirectoryLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel2)
                    .addComponent(jtxtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLabel6)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DirectoryLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel4)
                    .addComponent(DirectoryLabel5)
                    .addComponent(jPay)
                    .addComponent(jPay1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtAccountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAccountNameActionPerformed
        payment();
    }//GEN-LAST:event_jtxtAccountNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        payment();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAccountNoActionPerformed
        payment();
    }//GEN-LAST:event_jtxtAccountNoActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankTransferU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankTransferU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankTransferU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankTransferU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankTransferU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BankComboBox;
    private javax.swing.JLabel DirectoryLabel1;
    private javax.swing.JLabel DirectoryLabel2;
    private javax.swing.JLabel DirectoryLabel3;
    private javax.swing.JLabel DirectoryLabel4;
    private javax.swing.JLabel DirectoryLabel5;
    private javax.swing.JLabel DirectoryLabel6;
    private javax.swing.JLabel TitleLabel;
    public static javax.swing.JButton jButton1;
    public javax.swing.JLabel jPay;
    public static javax.swing.JLabel jPay1;
    private javax.swing.JTextField jtxtAccountName;
    private javax.swing.JTextField jtxtAccountNo;
    // End of variables declaration//GEN-END:variables

   
}
