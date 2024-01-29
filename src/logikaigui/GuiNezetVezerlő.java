
package logikaigui;

import javax.swing.JRadioButton;


public class GuiNezetVezerlő extends javax.swing.JFrame {

    /**
     * Creates new form GuiNezetVezerlő
     */
    private JRadioButton[] rdb;
    private boolean RogtonVizsgal;
    
    public GuiNezetVezerlő() {
        initComponents();
        /* esemény hatására állitsuk be */
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl_Leiras = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txa = new javax.swing.JTextArea();
        rb_arany = new javax.swing.JRadioButton();
        rb_ezust = new javax.swing.JRadioButton();
        rb_bronz = new javax.swing.JRadioButton();
        chbRogton = new javax.swing.JCheckBox();
        btnvizsgal = new javax.swing.JButton();
        er = new javax.swing.JLabel();
        eredmeny = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logikai_Gui");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_Leiras.setText("lbl.Leiras");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Feladat\n"));

        Txa.setColumns(20);
        Txa.setRows(5);
        jScrollPane1.setViewportView(Txa);

        buttonGroup1.add(rb_arany);
        rb_arany.setText("jRadioButton1");
        rb_arany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_aranyItemStateChanged(evt);
                kincsVizsgalat(evt);
            }
        });

        buttonGroup1.add(rb_ezust);
        rb_ezust.setText("jRadioButton2");
        rb_ezust.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rb_ezustItemStateChanged(evt);
                kincsVizsgalat(evt);
            }
        });

        buttonGroup1.add(rb_bronz);
        rb_bronz.setText("jRadioButton3");
        rb_bronz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });
        rb_bronz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_bronzActionPerformed(evt);
            }
        });

        chbRogton.setText("rögtön vizsgál");
        chbRogton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbRogtonItemStateChanged(evt);
            }
        });

        btnvizsgal.setText("Vizsgál");
        btnvizsgal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvizsgalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_bronz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnvizsgal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_ezust)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_arany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbRogton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_arany)
                    .addComponent(chbRogton))
                .addGap(18, 18, 18)
                .addComponent(rb_ezust)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_bronz)
                    .addComponent(btnvizsgal))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        er.setText("Eredmény");

        eredmeny.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Leiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eredmeny))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Leiras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(er)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RogtonVizsgal=false;
        lbl_Leiras.setText("Csak 1 állitas igaz!");
        String[] feliratok = {"én rejtem!", "nem én rejtem!", "az arany hazudik!"};  
        String[] anyagok = {"arany", "ezüst", "bronz"};
        rdb = new JRadioButton[3];
        rdb[0] =rb_arany;
        rdb[1] =rb_ezust;
        rdb[2] =rb_bronz;
        for (int i = 0; i < rdb.length;i++) {
            String anyag=anyagok[i];
            rdb[i].setText(anyagok[i]);
            String f=feliratok[i] + "\n";
            Txa.append(anyag + ": "+f);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnvizsgalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvizsgalActionPerformed
        vizsgal();
    }//GEN-LAST:event_btnvizsgalActionPerformed

    private void vizsgal() {
        int i=0;
        while(i<rdb.length && !rdb[i].isSelected()){
            i++;
        }
        if(i>=rdb.length){
            eredmeny.setText("nincs kiválasztva láda");
        }else if(i==1){//OOP: melyik ládában van a kincs --> if(lada.isKincs())
            eredmeny.setText("talált");
        }else {
            eredmeny.setText("nem talált");
        }
    }

    private void rb_bronzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_bronzActionPerformed
        if (RogtonVizsgal){
           vizsgal();
       }
    }//GEN-LAST:event_rb_bronzActionPerformed

    private void rb_aranyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_aranyItemStateChanged
       if (RogtonVizsgal){
           vizsgal();
       }
    }//GEN-LAST:event_rb_aranyItemStateChanged

    private void rb_ezustItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rb_ezustItemStateChanged
       if (RogtonVizsgal){
           vizsgal();
       }
    }//GEN-LAST:event_rb_ezustItemStateChanged

    private void chbRogtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbRogtonItemStateChanged
       btnvizsgal.setEnabled(!chbRogton.isSelected());
       RogtonVizsgal=chbRogton.isSelected();
    }//GEN-LAST:event_chbRogtonItemStateChanged

    private void kincsVizsgalat(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kincsVizsgalat
        if (RogtonVizsgal){
           vizsgal();
       }
    }//GEN-LAST:event_kincsVizsgalat

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiNezetVezerlő.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNezetVezerlő.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNezetVezerlő.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNezetVezerlő.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiNezetVezerlő().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Txa;
    private javax.swing.JButton btnvizsgal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbRogton;
    private javax.swing.JLabel er;
    private javax.swing.JTextField eredmeny;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Leiras;
    private javax.swing.JRadioButton rb_arany;
    private javax.swing.JRadioButton rb_bronz;
    private javax.swing.JRadioButton rb_ezust;
    // End of variables declaration//GEN-END:variables
}
