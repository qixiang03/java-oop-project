package assignment;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



public class RatingU extends javax.swing.JFrame {

    
    public int storageIndex = 0;
    public static String who = "";
    
    public RatingU() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SubmitButton = new javax.swing.JButton();
        DirectoryLabel1 = new javax.swing.JLabel();
        RatingSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentTextArea = new javax.swing.JTextArea();
        DirectoryLabel2 = new javax.swing.JLabel();
        RatingIndicatorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rating");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        TitleLabel.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Rating");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 450));

        SubmitButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        DirectoryLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 20)); // NOI18N
        DirectoryLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DirectoryLabel1.setText("How would you rate this campaign?");

        RatingSlider.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        RatingSlider.setMajorTickSpacing(1);
        RatingSlider.setMaximum(5);
        RatingSlider.setMinimum(1);
        RatingSlider.setSnapToTicks(true);
        RatingSlider.setToolTipText("");
        RatingSlider.setValue(3);
        RatingSlider.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RatingSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RatingSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RatingSliderStateChanged(evt);
            }
        });

        CommentTextArea.setColumns(20);
        CommentTextArea.setRows(5);
        CommentTextArea.setToolTipText("Comment here!");
        jScrollPane1.setViewportView(CommentTextArea);

        DirectoryLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        DirectoryLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DirectoryLabel2.setText("*Leave a comment if you'd like!");

        RatingIndicatorLabel.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        RatingIndicatorLabel.setForeground(new java.awt.Color(52, 50, 50));
        RatingIndicatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RatingIndicatorLabel.setText("Moderate");
        RatingIndicatorLabel.setBounds(new java.awt.Rectangle(0, 0, 42, 17));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DirectoryLabel2)
                .addGap(156, 156, 156))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubmitButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(DirectoryLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(RatingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(RatingIndicatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DirectoryLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLabel2)
                .addGap(18, 18, 18)
                .addComponent(RatingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RatingIndicatorLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        RatingCollectionA RatingCollection = new RatingCollectionA();
        RatingCollection.setVisible(false);
        
       
        
        int x = RatingSlider.getValue();
        String commentInput = CommentTextArea.getText();
        
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date); 
        

        String comment1 = commentInput.concat(!commentInput.equals("")?"<br>" : "- <br>");
        String finalcomment = "<html>User: "+ who+ "<br/>"  
                             +"Rating: " + String.valueOf(x) + "/5 <br/>"
                             +"Comment: " + comment1 + "<br/>" 
                             + strDate + "</html>";
        
        
        
       
        int remaining = (storageIndex +1)%5;
        
        switch(remaining){
        
            case 1: 
                RatingCollection.comment1.setVisible(true);
                RatingCollection.storage[0][0] = finalcomment;
                
                break;
                
            case 2:
                RatingCollection.comment2.setVisible(true);
                RatingCollection.storage[1][0] = finalcomment;
                break;
                
            case 3:
                RatingCollection.comment3.setVisible(true);
                RatingCollection.storage[2][0] = finalcomment;
                break;
                
            case 4:
                RatingCollection.comment4.setVisible(true);
                RatingCollection.storage[3][0] = finalcomment;
                break;
            
            case 0: 
                RatingCollection.comment5.setVisible(true);
                RatingCollection.storage[4][0] = finalcomment;
                break;
        
            }
        
             JOptionPane.showMessageDialog(null,"Upload completed! ");
             storageIndex++;
             WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
             Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
           
        
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void RatingSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RatingSliderStateChanged
        int x = RatingSlider.getValue();
        switch(x){
        
            case 1:
                RatingIndicatorLabel.setForeground(new java.awt.Color(102, 0, 0));
                RatingIndicatorLabel.setText("Michael Jackson Bad");
                break;
            
            case 2:
                RatingIndicatorLabel.setForeground(new java.awt.Color(78, 24, 24));
                RatingIndicatorLabel.setText("Bad");
                break;
                
            case 3:
                RatingIndicatorLabel.setForeground(new java.awt.Color(52, 50, 50));
                RatingIndicatorLabel.setText("Moderate");
                break;
                
            case 4:
                RatingIndicatorLabel.setForeground(new java.awt.Color(23, 79, 79));
                RatingIndicatorLabel.setText("Good");
                break;
                
            case 5:
                RatingIndicatorLabel.setForeground(new java.awt.Color(0, 102, 102));
                RatingIndicatorLabel.setText("Awesome");
                break;

        
        }
    }//GEN-LAST:event_RatingSliderStateChanged
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RatingU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RatingU().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentTextArea;
    private javax.swing.JLabel DirectoryLabel1;
    private javax.swing.JLabel DirectoryLabel2;
    private javax.swing.JLabel RatingIndicatorLabel;
    private javax.swing.JSlider RatingSlider;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
