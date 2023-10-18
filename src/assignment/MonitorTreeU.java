package assignment;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MonitorTreeU extends javax.swing.JFrame {

    
   public static String imgpath;
   public int integer;
   public String TreeID;
   public static String[][] ID= new String [100][3]; //[photoID][photoPath]
    
     public MonitorTreeU() {
        initComponents();
        SearchButton.setVisible(false);
        ImgTextField.setVisible(false);
        ratingLabel.setVisible(false);
         
        
    }
     
    public void inputImage(){
       for(int i=0;i<ID.length;i++){
           try{
            if(ID[i][0].equals(ImgTextField.getText().toUpperCase())){
            
           imgpath = ID[i][1];
           if(ID[i][1].equals("")){
           JOptionPane.showMessageDialog(null,"Your tree is yet to be planted.");
            TreeProgressBar.setValue(0);
            TreeProgressBar.setString("0 day");
            break;
           }
         
            ImageIcon TreeImg = new ImageIcon(imgpath);
            Image treeImg = TreeImg.getImage();
            Image newImg = treeImg.getScaledInstance(ImgLabel.getWidth(), ImgLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(newImg);
            
            ImgLabel.setIcon(ii);
            ImgLabel.setText("");
            TreeProgressBar.setValue(Integer.parseInt(ID[i][2]));
            String str = ID[i][2].equals("1")?" day":" days";
            TreeProgressBar.setString(ID[i][2].concat(str));
            
             RatingU RatingU = new RatingU();
             RatingU.setVisible(false);
             RatingU.who = ImgTextField.getText().toUpperCase();
            
            ratingLabel.setVisible(true);
            break;
           
        }
        }
      
           catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Your tree is yet to be planted or Wrong TreeID was keyed.");
                   ImgLabel.setIcon(null);
                   TreeProgressBar.setValue(0);
                   TreeProgressBar.setString("0 day");
                   break;
                   }
          
        }
        
            }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        ImgLabel = new javax.swing.JLabel();
        ImgTextField = new javax.swing.JTextField();
        TreeProgressBar = new javax.swing.JProgressBar();
        SearchButton = new javax.swing.JButton();
        DirectoryLabel2 = new javax.swing.JLabel();
        ImgLabel1 = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Label1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("Your beloved tree on the other side.");

        ImgLabel.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        ImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLabel.setText("nothing yet...");

        ShowButtonLabel.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        ShowButtonLabel.setForeground(new java.awt.Color(34, 0, 204));
        ShowButtonLabel.setText("<HTML><u>Find Your Tree!</u></HTML>");
        ShowButtonLabel.setToolTipText("");
        ShowButtonLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowButtonLabelMouseClicked(evt);
            }
        });

        ImgTextField.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        ImgTextField.setText("Your Tree ID");
        ImgTextField.setToolTipText("");
        ImgTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImgTextFieldActionPerformed(evt);
            }
        });

        TreeProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        TreeProgressBar.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        TreeProgressBar.setForeground(new java.awt.Color(0, 0, 0));
        TreeProgressBar.setToolTipText("");
        TreeProgressBar.setString("0 day");
        TreeProgressBar.setStringPainted(true);

        SearchButton.setFont(new java.awt.Font("SF Pro Display", 0, 13)); // NOI18N
        SearchButton.setText("🔎");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        DirectoryLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        DirectoryLabel2.setText("Status: ");

        ImgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/monitortreeuser.png"))); // NOI18N
        ImgLabel1.setText("-");

        ratingLabel.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(34, 0, 204));
        ratingLabel.setText("<HTML><u>Like our program? Tell us about it!</u></HTML>");
        ratingLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ratingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratingLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ratingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ShowButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DirectoryLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TreeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImgTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectoryLabel2)
                    .addComponent(TreeProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowButtonLabelMouseClicked
        ShowButtonLabel.setVisible(false);
        //ShowButtonLabel.setForeground(new java.awt.Color(96, 35, 162));
        SearchButton.setVisible(true);
        ImgTextField.setVisible(true);
        ImgTextField.requestFocus();

    }//GEN-LAST:event_ShowButtonLabelMouseClicked

    private void ImgTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgTextFieldActionPerformed
        inputImage();
    }//GEN-LAST:event_ImgTextFieldActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
     inputImage();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ratingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratingLabelMouseClicked
        new RatingU().setVisible(true);
    }//GEN-LAST:event_ratingLabelMouseClicked

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorTreeU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitorTreeU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DirectoryLabel2;
    public javax.swing.JLabel ImgLabel;
    private javax.swing.JLabel ImgLabel1;
    public javax.swing.JTextField ImgTextField;
    private javax.swing.JLabel Label1;
    public javax.swing.JButton SearchButton;
    private final javax.swing.JLabel ShowButtonLabel = new javax.swing.JLabel();
    public javax.swing.JProgressBar TreeProgressBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ratingLabel;
    // End of variables declaration//GEN-END:variables
}
