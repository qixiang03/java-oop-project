package assignment;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class OptionsU extends javax.swing.JFrame {

    
    public OptionsU() {
        initComponents();
        SearchTextField.requestFocus();
        
        UpdatePhotoA UpdatePhotoA = new UpdatePhotoA();
        if(UpdatePhotoA.edited[0][0].equals("1")){
                ImageIcon TreeImg = new ImageIcon(UpdatePhotoA.edited[0][1]);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(IndonesiaImglabel.getWidth(), IndonesiaImglabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);
                IndonesiaImglabel.setIcon(ii);
        }
        
        if(UpdatePhotoA.edited[1][0].equals("1")){
                ImageIcon TreeImg = new ImageIcon(UpdatePhotoA.edited[1][1]);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(MalaysiaImgLabel.getWidth(), MalaysiaImgLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);
                MalaysiaImgLabel.setIcon(ii);
        }
        
        if(UpdatePhotoA.edited[2][0].equals("1")){
                ImageIcon TreeImg = new ImageIcon(UpdatePhotoA.edited[2][1]);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(MyanmarImglabel.getWidth(), MyanmarImglabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);
                MyanmarImglabel.setIcon(ii);
        }
       
        if(UpdatePhotoA.edited[3][0].equals("1")){
                ImageIcon TreeImg = new ImageIcon(UpdatePhotoA.edited[3][1]);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(PhilipinesImgLabel.getWidth(), PhilipinesImgLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);
                PhilipinesImgLabel.setIcon(ii);
        }
        
        if(UpdatePhotoA.edited[4][0].equals("1")){
                ImageIcon TreeImg = new ImageIcon(UpdatePhotoA.edited[4][1]);
                Image treeImg = TreeImg.getImage();
                Image newImg = treeImg.getScaledInstance(ThailandImgLabel.getWidth(), ThailandImgLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(newImg);
                ThailandImgLabel.setIcon(ii);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SearchTextField = new javax.swing.JTextField();
        HomeImgLabel = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        ThailandImgLabel = new javax.swing.JLabel();
        IndonesiaImglabel = new javax.swing.JLabel();
        MyanmarImglabel = new javax.swing.JLabel();
        MalaysiaImgLabel = new javax.swing.JLabel();
        PhilipinesImgLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TitleLabel = new javax.swing.JLabel();
        IndonesiaButton = new javax.swing.JButton();
        MyanmarButton = new javax.swing.JButton();
        MalaysiaButton = new javax.swing.JButton();
        PhilipinesButton = new javax.swing.JButton();
        ThailandButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WHERE WE PLANT");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        SearchTextField.setBackground(new java.awt.Color(0, 102, 102));
        SearchTextField.setForeground(new java.awt.Color(255, 255, 255));
        SearchTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        HomeImgLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (1).png"))); // NOI18N
        HomeImgLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeImgLabelMousePressed(evt);
            }
        });

        HomeLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        HomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabel.setText("HOME PAGE");
        HomeLabel.setPreferredSize(new java.awt.Dimension(81, 20));
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(HomeImgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        ThailandImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thailand.jpg"))); // NOI18N

        IndonesiaImglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/indonesia.jpg"))); // NOI18N

        MyanmarImglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/india.jpg"))); // NOI18N

        MalaysiaImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mangrooves.jpg"))); // NOI18N

        PhilipinesImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/philipines.jpg"))); // NOI18N

        TitleLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("WHERE WE PLANT ");

        IndonesiaButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        IndonesiaButton.setText("INDONESIA");
        IndonesiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndonesiaButtonActionPerformed(evt);
            }
        });

        MyanmarButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        MyanmarButton.setText("MYANMAR");
        MyanmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyanmarButtonActionPerformed(evt);
            }
        });

        MalaysiaButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        MalaysiaButton.setText("MALAYSIA");
        MalaysiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalaysiaButtonActionPerformed(evt);
            }
        });

        PhilipinesButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        PhilipinesButton.setText("PHILIPINES");
        PhilipinesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhilipinesButtonActionPerformed(evt);
            }
        });

        ThailandButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ThailandButton.setText("THAILAND");
        ThailandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThailandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(ThailandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(PhilipinesButton)
                .addGap(93, 93, 93)
                .addComponent(MalaysiaButton)
                .addGap(75, 75, 75)
                .addComponent(MyanmarButton)
                .addGap(74, 74, 74)
                .addComponent(IndonesiaButton)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ThailandImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PhilipinesImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(MalaysiaImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MyanmarImglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IndonesiaImglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThailandImgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhilipinesImgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MalaysiaImgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MyanmarImglabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IndonesiaImglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThailandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhilipinesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MalaysiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyanmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IndonesiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        String search = SearchTextField.getText().toLowerCase();

        switch (search){
            case "login":
            LoginMenuA Info = new LoginMenuA();
            Info.setVisible(true);
            break;
            case "option":
            this.requestFocus();
            break;
            case "thailand":
            new ThailandU().setVisible(true);
            break;
            case "philipines":
            new PhilipinesU().setVisible(true);
            break;
            case "indonesia":
            IndonesiaU Info4 = new IndonesiaU();
            Info4.setVisible(true);
            break;
            case "malaysia":
            MalaysiaU Info5 = new MalaysiaU();
            Info5.setVisible(true);
            break;
            case "myanmar":
            new MyanmarU().setVisible(true);
            break;
            
            default:
            JOptionPane.showMessageDialog(null,"Search Not Found","Error", JOptionPane.ERROR_MESSAGE);
            SearchTextField.setText(null);
            break;
        }
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void HomeImgLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeImgLabelMousePressed
        this.toBack();
    }//GEN-LAST:event_HomeImgLabelMousePressed

    private void HomeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMousePressed
        this.toBack();
    }//GEN-LAST:event_HomeLabelMousePressed

    private void IndonesiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndonesiaButtonActionPerformed
        new IndonesiaU().setVisible(true);
    }//GEN-LAST:event_IndonesiaButtonActionPerformed

    private void MyanmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyanmarButtonActionPerformed
        new MyanmarU().setVisible(true);
    }//GEN-LAST:event_MyanmarButtonActionPerformed

    private void MalaysiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalaysiaButtonActionPerformed
        new MalaysiaU().setVisible(true);
    }//GEN-LAST:event_MalaysiaButtonActionPerformed

    private void PhilipinesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhilipinesButtonActionPerformed
        new PhilipinesU().setVisible(true);
    }//GEN-LAST:event_PhilipinesButtonActionPerformed

    private void ThailandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThailandButtonActionPerformed
        new ThailandU().setVisible(true);
    }//GEN-LAST:event_ThailandButtonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OptionsU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeImgLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JButton IndonesiaButton;
    private javax.swing.JLabel IndonesiaImglabel;
    private javax.swing.JButton MalaysiaButton;
    private javax.swing.JLabel MalaysiaImgLabel;
    private javax.swing.JButton MyanmarButton;
    private javax.swing.JLabel MyanmarImglabel;
    private javax.swing.JButton PhilipinesButton;
    private javax.swing.JLabel PhilipinesImgLabel;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton ThailandButton;
    private javax.swing.JLabel ThailandImgLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
