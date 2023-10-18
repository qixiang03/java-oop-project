package assignment;

import static assignment.MonitorTreeU.ID;
import java.awt.Image;
import java.io.File;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MonitorTreeA extends javax.swing.JFrame {

    public int n=1;
   
    public MonitorTreeA() {
        initComponents();
        UserInputTxtField.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImgLabel = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();
        DirectoryLabel1 = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ImgLabel1 = new javax.swing.JLabel();
        UserInputTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ImgLabel.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        ImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLabel.setText("nothing yet...");
        ImgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        UploadButton.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        UploadButton.setText("Upload Image");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        DirectoryLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        DirectoryLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DirectoryLabel1.setText("User ID:");

        TitleLabel.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        TitleLabel.setText("Upload user's corresponding image.");

        ImgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/monitortreeadmin.png"))); // NOI18N

        UserInputTxtField.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserInputTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(UploadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserInputTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        String UserID = UserInputTxtField.getText().toUpperCase();
        for(int i=0;i<ID.length;i++){
                        try{
                            if(UserID.equals("")){
            JOptionPane.showMessageDialog(null,"You have not inserted any UserID yet!");
            break;
        }
                       if(ID[i][0].equals(UserID)){
                               
             
            JFileChooser input = new JFileChooser();
            input.setCurrentDirectory(new File(System.getProperty("user.home")));
            input.setDialogTitle("Upload Image");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
            input.addChoosableFileFilter(filter);
            int result = input.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {

                File selectedFile = input.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                ImageIcon TreeImg = new ImageIcon(path);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(ImgLabel.getWidth(), ImgLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);

                int confirm = JOptionPane.showConfirmDialog(null,"Please confirm information for user."+ "\n"
                    + "User ID:"+ UserID +"\n"
                    + "Image Path:"+ path +"\n" ,"Upload Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,"Write the information again");
                    System.exit(0);
                }

                else if (confirm == JOptionPane.YES_OPTION) {
                    
                    MonitorTreeU info = new MonitorTreeU();
                    info.setVisible(false);

                    for(int m=0;m<ID.length;m++){
                        try{
                            if(ID[m][0].equals(UserID)){
                                ID[m][1]=path;
                                JOptionPane.showMessageDialog(null,"Upload completed! ");
                                 ImgLabel.setIcon(ii);
                                 ImgLabel.setText("");
                                 MonitorTreeU.imgpath = path;
                                 Random rand = new Random();
                                 ID[m][2]= String.valueOf(rand.nextInt(100));
                                break;
                            }
                        }

                        catch(Exception e){
                            JOptionPane.showMessageDialog(null,"Something has gone wrong. Please try again.");
                            ImgLabel.setIcon(null);
                            ImgLabel.setText("nothing yet...");
                            break;
                        }
                    }
                    break;
                }

                

                }else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("Cancel was selected.");
                    JOptionPane.showMessageDialog(null, "Cancel was selected.");
                    break;
                       }
                                
                                 
                            }
                        }

                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, "You have entered a wrong ID! Please try again.");
                            break;
                        }
                    }
        
        
    }//GEN-LAST:event_UploadButtonActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitorTreeA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DirectoryLabel1;
    public javax.swing.JLabel ImgLabel;
    private javax.swing.JLabel ImgLabel1;
    public javax.swing.JLabel TitleLabel;
    public javax.swing.JButton UploadButton;
    private javax.swing.JTextField UserInputTxtField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
