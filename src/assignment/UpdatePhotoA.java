package assignment;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class UpdatePhotoA extends javax.swing.JFrame {

    public static String[][] edited = {
            {"",""},
            {"",""},
            {"",""},
            {"",""},
            {"",""}
        };
    
    
    
    public UpdatePhotoA() {
        initComponents();
    }
    
    
    
    public String InsertPhoto(String input, int x){
    
            
            JFileChooser insert = new JFileChooser();
            insert.setCurrentDirectory(new File(System.getProperty("user.home")));
            insert.setDialogTitle("Upload Image");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
            insert.addChoosableFileFilter(filter);
            int result = insert.showOpenDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile = insert.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                int confirm = JOptionPane.showConfirmDialog(null,"Please confirm information."+ "\n"
                    + "Location:"+ input +"\n"
                    + "Image Path:"+ path +"\n" ,"Upload Confirmation", JOptionPane.OK_CANCEL_OPTION);
                
                if(confirm == JOptionPane.OK_OPTION){
                ImageIcon ImgIcon = new ImageIcon(path);
                Image Image1 = ImgIcon.getImage();
                Image newImg = Image1.getScaledInstance(ImgLabel.getWidth(), ImgLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon finalImg = new ImageIcon(newImg);
                ImgLabel.setIcon(finalImg);
                ImgLabel.setText("");
                JOptionPane.showMessageDialog(null,"Upload Completed.");
                edited[x][0]= "1";
                return path;
                }
                
                else if (confirm == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"Write the information again");
                return "";
                }
               
                
            }
                
            else if(result == JFileChooser.CANCEL_OPTION){
                 System.out.println("Cancel was selected.");
                 JOptionPane.showMessageDialog(null,"Cancel was selected.");
                 return "";
            }
            
            
           return "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DirectoryLabel1 = new javax.swing.JLabel();
        InputComboBox = new javax.swing.JComboBox<>();
        UploadButton = new javax.swing.JButton();
        ImgLabel = new javax.swing.JLabel();
        ImgLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        TitleLabel.setFont(new java.awt.Font("SF Pro Display", 1, 30)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Update Info Image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        DirectoryLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        DirectoryLabel1.setText("Edit:");

        InputComboBox.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        InputComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Indonesia", "Malaysia", "Myanmar", "Philipines", "Thailand" }));

        UploadButton.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        UploadButton.setText("Upload Image");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        ImgLabel.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        ImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLabel.setText("nothing yet...");
        ImgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ImgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/updateimage.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DirectoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(UploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(InputComboBox)
                            .addComponent(UploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(DirectoryLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
       
        String input = InputComboBox.getSelectedItem().toString();
        
        switch(input){
        
            case "-": 
                JOptionPane.showMessageDialog(null,"You have not selected anything yet. Please try again.");
                break;
            
            case "Indonesia":
               edited[0][1]= InsertPhoto("Indonesia",0);
               break;
            
            case "Malaysia":
               edited[1][1]= InsertPhoto("Malaysia",1);
               break;   
               
            case "Myanmar":
               edited[2][1]= InsertPhoto("Myanmar",2);
               break;   
               
            case "Philipines":
               edited[3][1]= InsertPhoto("Philipines",3);
               break;
               
            case "Thailand":
               edited[4][1]= InsertPhoto("Thailand",4);
               break;
                
                 
                
        
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
            java.util.logging.Logger.getLogger(UpdatePhotoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePhotoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePhotoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePhotoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePhotoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DirectoryLabel1;
    private javax.swing.JLabel ImgLabel;
    private javax.swing.JLabel ImgLabel1;
    private javax.swing.JComboBox<String> InputComboBox;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton UploadButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
