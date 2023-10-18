package assignment;

import static assignment.MonitorTreeU.ID;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


import java.util.Random;

public class CardU extends javax.swing.JFrame {

    
    public  String randomString = "";
    public static String amount;
    int IDindex=0;
    public CardU() {
        initComponents();
    }
    
    public void payment(){
    String cardNo = jtxtCardNo.getText();
        String ExpiryDate = jtxtExpiry.getText();
        String CVC = jtxtCVC.getText();
        
        String Char_list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String randomString ="";
        int length = 6;
        
        Random rand = new Random();
        
        char[] text = new char[length];
        
        for(int i=0; i< length; i++){
            text[i] = Char_list.charAt(rand.nextInt(Char_list.length()));
        }
        
        for(int i=0; i< text.length; i++){
            randomString += text[i];
        }
        
        int length1 = cardNo.length();
        int length2 = ExpiryDate.length();
        int length3 = CVC.length();
        
        do{
           try{
               Long cardno = Long.parseLong(cardNo);
               Long expirydate = Long.parseLong(ExpiryDate);
               Long cvc = Long.parseLong(CVC);
               if (cardNo.length() !=16 || ExpiryDate.length() !=4 || CVC.length()!=3){
                   JOptionPane.showMessageDialog(null,"Please Enter again!");
                   break;
                }
               else{
                   int confirm = JOptionPane.showConfirmDialog(null,"Are the information given correct?"+ "\n"
                              + "\n" 
                              + "Card number: "+cardNo+"\n"
                              + "Valid thru number: "+ExpiryDate+"\n"
                              + "CVC: "+CVC + "\n"
                              + "Total payable amount: $" + amount,
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
                        ID[IDindex][0] = randomString;
                        ID[IDindex][1] = "";
                    IDindex++;
                    randomString = "";
                     WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
                        break;
                        }
                    }
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null,"Please enter digit only!");
               break;
            }
        }while(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        DirectoryLabel1 = new javax.swing.JLabel();
        DirectoryLabel2 = new javax.swing.JLabel();
        DirectoryLabel3 = new javax.swing.JLabel();
        jtxtCardNo = new javax.swing.JTextField();
        jtxtExpiry = new javax.swing.JTextField();
        jtxtCVC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DirectoryLabel4 = new javax.swing.JLabel();
        DirectoryLabel5 = new javax.swing.JLabel();
        DirectoryLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setText("CARD DETAILS");

        DirectoryLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DirectoryLabel1.setText("Card Number:");

        DirectoryLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DirectoryLabel2.setText("Expiry Date:");

        DirectoryLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DirectoryLabel3.setText("CVC");

        jtxtCardNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCardNoActionPerformed(evt);
            }
        });

        jtxtExpiry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtExpiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtExpiryActionPerformed(evt);
            }
        });

        jtxtCVC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtCVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCVCActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DirectoryLabel4.setText("16-digits only");

        DirectoryLabel5.setText("4 digits only");

        DirectoryLabel6.setText("3 digits only");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtCardNo, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DirectoryLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(DirectoryLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtExpiry)
                                    .addComponent(jtxtCVC)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DirectoryLabel4)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DirectoryLabel5)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DirectoryLabel6)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLabel4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLabel5)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel3)
                    .addComponent(jtxtCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLabel6)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCardNoActionPerformed
        payment();
    }//GEN-LAST:event_jtxtCardNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        payment();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtExpiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtExpiryActionPerformed
        payment();
    }//GEN-LAST:event_jtxtExpiryActionPerformed

    private void jtxtCVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCVCActionPerformed
        payment();
    }//GEN-LAST:event_jtxtCVCActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CardU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DirectoryLabel1;
    private javax.swing.JLabel DirectoryLabel2;
    private javax.swing.JLabel DirectoryLabel3;
    private javax.swing.JLabel DirectoryLabel4;
    private javax.swing.JLabel DirectoryLabel5;
    private javax.swing.JLabel DirectoryLabel6;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jtxtCVC;
    private javax.swing.JTextField jtxtCardNo;
    private javax.swing.JTextField jtxtExpiry;
    // End of variables declaration//GEN-END:variables
}
