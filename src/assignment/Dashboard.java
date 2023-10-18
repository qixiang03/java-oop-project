package assignment;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Dashboard extends javax.swing.JFrame {

   
    
    public Dashboard() {
        initComponents();
        SearchTextField.requestFocus();
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,153,153));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,102,102));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        TitleLabel2 = new javax.swing.JLabel();
        TitleLabel1 = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        jbtnDonate = new javax.swing.JButton();
        jbtnPlant = new javax.swing.JButton();
        TitleLabel4 = new javax.swing.JLabel();
        TitleImgLabel2 = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        HomeImgLabel = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        btn_Login = new javax.swing.JPanel();
        LoginImgLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        btn_Plant = new javax.swing.JPanel();
        PlusButton1 = new javax.swing.JLabel();
        WhereWePlantLabel = new javax.swing.JLabel();
        btn_Trees = new javax.swing.JPanel();
        PlusButton2 = new javax.swing.JLabel();
        WhyTreesLabel = new javax.swing.JLabel();
        btn_AboutUs = new javax.swing.JPanel();
        PlusButton3 = new javax.swing.JLabel();
        AboutUsLabel = new javax.swing.JLabel();
        TitleLabel3 = new javax.swing.JLabel();
        TitleImgLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(900, 480));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(900, 480));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 196, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        TitleLabel2.setText("ONE DOLLAR. ONE TREE. ONE EARTH.");

        TitleLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        TitleLabel1.setText("WE PLANT TREES");

        SearchTextField.setBackground(new java.awt.Color(204, 255, 204));
        SearchTextField.setToolTipText("Search");
        SearchTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(TitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        bg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));

        jbtnDonate.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jbtnDonate.setText("CHECK YOUR TREE");
        jbtnDonate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnDonate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDonateActionPerformed(evt);
            }
        });
        bg.add(jbtnDonate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, 50));

        jbtnPlant.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jbtnPlant.setText("PLANT A TREE");
        jbtnPlant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnPlant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPlant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlantActionPerformed(evt);
            }
        });
        bg.add(jbtnPlant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 190, 50));

        TitleLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TitleLabel4.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel4.setText("TOGETHER, PLANTING A FOREST!");
        bg.add(TitleLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 250, 20));

        TitleImgLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/—Pngtree—tropical jungle_1901140.png"))); // NOI18N
        TitleImgLabel2.setText("jLabel16");
        bg.add(TitleImgLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 650, 260));

        sidepanel.setBackground(new java.awt.Color(0, 51, 51));

        btn_home.setBackground(new java.awt.Color(0, 102, 102));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HomeImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (1).png"))); // NOI18N

        HomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabel.setText("Home Page");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(HomeImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomeImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Login.setBackground(new java.awt.Color(0, 102, 102));
        btn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_LoginMousePressed(evt);
            }
        });

        LoginImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N

        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setText("Login (Admin)");

        javax.swing.GroupLayout btn_LoginLayout = new javax.swing.GroupLayout(btn_Login);
        btn_Login.setLayout(btn_LoginLayout);
        btn_LoginLayout.setHorizontalGroup(
            btn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_LoginLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LoginImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_LoginLayout.setVerticalGroup(
            btn_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginImgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Plant.setBackground(new java.awt.Color(0, 102, 102));
        btn_Plant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Plant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PlantMousePressed(evt);
            }
        });

        PlusButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlusButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N

        WhereWePlantLabel.setForeground(new java.awt.Color(255, 255, 255));
        WhereWePlantLabel.setText("Where We Plant");

        javax.swing.GroupLayout btn_PlantLayout = new javax.swing.GroupLayout(btn_Plant);
        btn_Plant.setLayout(btn_PlantLayout);
        btn_PlantLayout.setHorizontalGroup(
            btn_PlantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_PlantLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PlusButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WhereWePlantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_PlantLayout.setVerticalGroup(
            btn_PlantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlusButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_PlantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhereWePlantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Trees.setBackground(new java.awt.Color(0, 102, 102));
        btn_Trees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Trees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TreesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_TreesMousePressed(evt);
            }
        });

        PlusButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlusButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N

        WhyTreesLabel.setForeground(new java.awt.Color(255, 255, 255));
        WhyTreesLabel.setText("Why Trees?");

        javax.swing.GroupLayout btn_TreesLayout = new javax.swing.GroupLayout(btn_Trees);
        btn_Trees.setLayout(btn_TreesLayout);
        btn_TreesLayout.setHorizontalGroup(
            btn_TreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_TreesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PlusButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WhyTreesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_TreesLayout.setVerticalGroup(
            btn_TreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlusButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_TreesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhyTreesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_AboutUs.setBackground(new java.awt.Color(0, 102, 102));
        btn_AboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AboutUsMousePressed(evt);
            }
        });

        PlusButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlusButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N

        AboutUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        AboutUsLabel.setText("About Us ");

        javax.swing.GroupLayout btn_AboutUsLayout = new javax.swing.GroupLayout(btn_AboutUs);
        btn_AboutUs.setLayout(btn_AboutUsLayout);
        btn_AboutUsLayout.setHorizontalGroup(
            btn_AboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_AboutUsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PlusButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AboutUsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_AboutUsLayout.setVerticalGroup(
            btn_AboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlusButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_AboutUsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutUsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        TitleLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        TitleLabel3.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel3.setText("SDG 13 ");

        TitleImgLabel1.setForeground(new java.awt.Color(0, 102, 102));
        TitleImgLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tree-with-many-leaves.png"))); // NOI18N
        TitleImgLabel1.setText("jLabel14");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Plant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Trees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_AboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(TitleImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleImgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Plant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Trees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMousePressed
        setColor(btn_Login);
        resetColor(btn_Plant);
        resetColor(btn_Trees);
        resetColor(btn_AboutUs);
        new LoginMenuA().setVisible(true);
    }//GEN-LAST:event_btn_LoginMousePressed

    private void btn_PlantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PlantMousePressed
        setColor(btn_Plant);
        resetColor(btn_Login);
        resetColor(btn_Trees);
        resetColor(btn_AboutUs);
        new OptionsU().setVisible(true);
    }//GEN-LAST:event_btn_PlantMousePressed

    private void btn_TreesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TreesMousePressed
        setColor(btn_Trees);
        resetColor(btn_Plant);
        resetColor(btn_Login);
        resetColor(btn_AboutUs);
        new TreesU().setVisible(true);
    }//GEN-LAST:event_btn_TreesMousePressed

    private void btn_AboutUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AboutUsMousePressed
        setColor(btn_AboutUs);
        resetColor(btn_Plant);
        resetColor(btn_Trees);
        resetColor(btn_Login);
        new AboutUs().setVisible(true);
    }//GEN-LAST:event_btn_AboutUsMousePressed

    private void jbtnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDonateActionPerformed
        new MonitorTreeU().setVisible(true);
    }//GEN-LAST:event_jbtnDonateActionPerformed

    private void jbtnPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlantActionPerformed
        new DonateU().setVisible(true);
    }//GEN-LAST:event_jbtnPlantActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        String search = SearchTextField.getText().toLowerCase();
        
        switch (search){
            case "login":
                LoginMenuA Info = new LoginMenuA();
                Info.setVisible(true);
                break;
            case "option":
                OptionsU Info1 = new OptionsU();
                Info1.setVisible(true);
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
            default:
                JOptionPane.showMessageDialog(null,"Search Not Found","Error", JOptionPane.ERROR_MESSAGE);
                SearchTextField.setText(null);
                break;
        }
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void btn_TreesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TreesMouseClicked
        setColor(btn_Plant);
        resetColor(btn_Login);
        resetColor(btn_Trees);
        resetColor(btn_AboutUs);
        new TreesU().setVisible(true);
    }//GEN-LAST:event_btn_TreesMouseClicked

   
    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUsLabel;
    private javax.swing.JLabel HomeImgLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LoginImgLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel PlusButton1;
    private javax.swing.JLabel PlusButton2;
    private javax.swing.JLabel PlusButton3;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel TitleImgLabel1;
    private javax.swing.JLabel TitleImgLabel2;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JLabel TitleLabel2;
    private javax.swing.JLabel TitleLabel3;
    private javax.swing.JLabel TitleLabel4;
    private javax.swing.JLabel WhereWePlantLabel;
    private javax.swing.JLabel WhyTreesLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btn_AboutUs;
    private javax.swing.JPanel btn_Login;
    private javax.swing.JPanel btn_Plant;
    private javax.swing.JPanel btn_Trees;
    private javax.swing.JPanel btn_home;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnDonate;
    private javax.swing.JButton jbtnPlant;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables

    

    
}
