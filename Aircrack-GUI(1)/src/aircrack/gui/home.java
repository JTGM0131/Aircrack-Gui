
package aircrack.gui;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.*;
import javax.swing.*;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eula1 = new java.awt.TextArea();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nicsa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmac = new javax.swing.JTextField();
        newmac = new javax.swing.JTextField();
        cm = new javax.swing.JTextField();
        smac = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        scannic = new javax.swing.JButton();
        nic = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        emm = new javax.swing.JButton();
        dmm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nicinfo = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        cmacb = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nicc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        eula = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("Ver 0.01 Build 2016 Alpha");

        jLabel5.setText("Status:");

        eula.setText("Author: Joco Tan Guan Min\n This software is developed"
            + "to perform network wep packet monitoring and attemp to break\n"
            + "the password with the help of aircrack-ng framework.\n");
        eula1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eula1.setEditable(false);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Status:");

        nicsa.setEditable(false);
        nicsa.setText("Standing by...");
        nicsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicsaActionPerformed(evt);
            }
        });

        jLabel6.setText("Select interface:");

        jLabel7.setText("Mac Change:");

        cmac.setEditable(false);
        cmac.setText("Current Mac address");
        cmac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmacActionPerformed(evt);
            }
        });

        newmac.setText("Enter a new Mac address");
        newmac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmacActionPerformed(evt);
            }
        });

        cm.setEditable(false);
        cm.setText("Standing by...");
        cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmActionPerformed(evt);
            }
        });

        smac.setBackground(new java.awt.Color(255, 255, 255));
        smac.setText("Scan MAC");
        smac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smacActionPerformed(evt);
            }
        });

        jLabel8.setText("New Mac:");

        scannic.setBackground(new java.awt.Color(255, 255, 255));
        scannic.setText("Scan NIC");
        scannic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                scannicStateChanged(evt);
            }
        });
        scannic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scannicActionPerformed(evt);
            }
        });

        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Interface Down");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Interface Up");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        emm.setBackground(new java.awt.Color(255, 255, 255));
        emm.setText("Enable Monitor Mode");
        emm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emmActionPerformed(evt);
            }
        });

        dmm.setBackground(new java.awt.Color(255, 255, 255));
        dmm.setText("Disnable Monitor Mode");
        dmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmmActionPerformed(evt);
            }
        });

        nicinfo.setEditable(false);
        nicinfo.setColumns(20);
        nicinfo.setRows(5);
        jScrollPane1.setViewportView(nicinfo);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("OK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cmacb.setBackground(new java.awt.Color(255, 255, 255));
        cmacb.setText("Change");
        cmacb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmacbActionPerformed(evt);
            }
        });

        jLabel9.setText("Information:");

        nicc.setText("Custom interface");
        nicc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 644, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(smac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scannic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nicsa)
                                            .addComponent(cmac)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(newmac, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmacb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nicc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dmm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nicc)
                                    .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(nicsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scannic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newmac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmacb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(smac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dmm))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Monitor Mode", jPanel1);

        jLabel11.setText("Note: Features are still experimental. Enable monitor mode before using this section.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nearby Netowks", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("WEP attack", jPanel2);

        eula.setText("Author: Joco Tan Guan Min\n This software is developed"
            + "to perform network wep packet monitoring and attemp to break\n"
            + "the password with the help of aircrack-ng framework.\n");
        eula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eula.setEditable(false);

        jLabel1.setText("About Us");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eula, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eula, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("About", jPanel5);

        jLabel10.setText("Please go to Monitor tab to enable monitor mode first before using this tab. Features are still experimental, use it at your own risks.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Others", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mcsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Process p = null;
        try {
            p = Runtime.getRuntime().exec("ifconfig "
                    + nic.getSelectedItem()+" up");
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Process p = null;
        try {
            p = Runtime.getRuntime().exec("ifconfig "
                    + nic.getSelectedItem()+" down");
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void scannicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scannicActionPerformed
        nicsa.setText("Please select a wireless interface...");
        int k=99;
        String[]niclist=new String[k];
        Enumeration<NetworkInterface> eni = null;
        try {
            eni = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i=0;
        for (NetworkInterface ni : Collections.list(eni)) {
            niclist[i]=ni.getName();
            if(niclist[i].matches("^[w,l,a,n]{4}\\d{1}")||niclist[i].matches("^[w,l,a,n]{4}\\d{2}")){
                nic.addItem(niclist[i]);
                i++;
            }else{nicsa.setText("No Wireless Interface found..");
            }
        }
        nic.addItem("wlan0");
        Process p = null;
        try {
            p = Runtime.getRuntime().exec("ifconfig");
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
nicinfo.setText(output);
    }//GEN-LAST:event_scannicActionPerformed

    private void smacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smacActionPerformed
Process p = null;
        try {
            p = Runtime.getRuntime().exec("macchanger "
                    + nic.getSelectedItem());
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
cmac.setText(output);

    }//GEN-LAST:event_smacActionPerformed

    private void cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmActionPerformed

    private void newmacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmacActionPerformed
        String NM=newmac.getText();
        if(NM.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$")){
        cm.setText(NM);}
        
        else{
        cm.setText("Wrong Format (xx:xx:xx:xx:xx:xx)...");}
    }//GEN-LAST:event_newmacActionPerformed

    private void cmacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmacActionPerformed

    private void nicsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicsaActionPerformed

    private void emmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emmActionPerformed
Process p = null;
        try {
            p = Runtime.getRuntime().exec("airmon-ng start "+nic.getSelectedItem());
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_emmActionPerformed

    private void dmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmmActionPerformed
Process p = null;
        try {
            p = Runtime.getRuntime().exec("airmon-ng stop "+nic.getSelectedItem());
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dmmActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
nicsa.setText("Wireless interface "+nic.getSelectedItem()+" selected...");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmacbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmacbActionPerformed

        Process p = null;
        String NM=newmac.getText();
        if(NM.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$")){
        cm.setText(NM);
        try {
            p = Runtime.getRuntime().exec("macchanger "
                    + nic.getSelectedItem()+" -m "+NM);
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
  BufferedReader buf = new BufferedReader(new InputStreamReader(
          p.getInputStream()));
  String line = "";
  String output = "";

        try {
            while ((line = buf.readLine()) != null) {
                output += line + "\n";
            }     } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        nicinfo.setText(output);
        }else{
        cm.setText("Wrong Format (xx:xx:xx:xx:xx:xx)...");}
                
    }//GEN-LAST:event_cmacbActionPerformed

    private void scannicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_scannicStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_scannicStateChanged

    private void niccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niccActionPerformed
String NI;
NI = nicc.getText();
if(NI.matches("^[w,l,a,n]{4}\\d{1}")||NI.matches("^[w,l,a,n]{4}\\d{2}")){
                nic.addItem(NI);
            }else{nicsa.setText("Please enter a valid wireless inteface.");}
    }//GEN-LAST:event_niccActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cm;
    private javax.swing.JTextField cmac;
    private javax.swing.JButton cmacb;
    private javax.swing.JButton dmm;
    private javax.swing.JButton emm;
    private java.awt.TextArea eula;
    private java.awt.TextArea eula1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField newmac;
    private javax.swing.JComboBox<String> nic;
    private javax.swing.JTextField nicc;
    private javax.swing.JTextArea nicinfo;
    private javax.swing.JTextField nicsa;
    private javax.swing.JButton scannic;
    private javax.swing.JButton smac;
    // End of variables declaration//GEN-END:variables
}
