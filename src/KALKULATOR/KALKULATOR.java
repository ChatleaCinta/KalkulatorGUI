/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KALKULATOR;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 *
 * @author PC
 */
public class KALKULATOR extends javax.swing.JFrame {
String angka = " ";
double jumlah,angka1,angka2;
int pilih;
    /**
     * Creates new form KALKULATOR
     */
    public KALKULATOR() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        layar = new javax.swing.JTextField();
        tiga = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        operasi = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        desimal = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        persen = new javax.swing.JButton();

        jFrame1.setTitle("KALKULATOR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        layar.setEditable(false);
        layar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layarActionPerformed(evt);
            }
        });
        jPanel1.add(layar);
        layar.setBounds(10, 50, 280, 80);

        tiga.setBackground(new java.awt.Color(255, 153, 0));
        tiga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jPanel1.add(tiga);
        tiga.setBounds(150, 320, 60, 50);

        dua.setBackground(new java.awt.Color(255, 153, 0));
        dua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua);
        dua.setBounds(80, 320, 60, 50);

        delapan.setBackground(new java.awt.Color(255, 153, 0));
        delapan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan);
        delapan.setBounds(80, 200, 60, 50);

        enam.setBackground(new java.awt.Color(255, 153, 51));
        enam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam);
        enam.setBounds(150, 260, 60, 50);

        lima.setBackground(new java.awt.Color(255, 153, 0));
        lima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima);
        lima.setBounds(80, 260, 60, 50);

        empat.setBackground(new java.awt.Color(255, 153, 0));
        empat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat);
        empat.setBounds(10, 260, 60, 50);

        nol.setBackground(new java.awt.Color(255, 153, 0));
        nol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        jPanel1.add(nol);
        nol.setBounds(10, 380, 130, 50);

        operasi.setBackground(new java.awt.Color(255, 153, 0));
        operasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        operasi.setText("=");
        operasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiActionPerformed(evt);
            }
        });
        jPanel1.add(operasi);
        operasi.setBounds(220, 380, 70, 50);

        tambah.setBackground(new java.awt.Color(255, 153, 0));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(220, 320, 70, 50);

        backspace.setBackground(new java.awt.Color(255, 153, 0));
        backspace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backspace.setText("<-");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        jPanel1.add(backspace);
        backspace.setBounds(80, 140, 60, 50);

        kurang.setBackground(new java.awt.Color(255, 153, 0));
        kurang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang);
        kurang.setBounds(220, 260, 70, 50);

        kali.setBackground(new java.awt.Color(255, 153, 0));
        kali.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali);
        kali.setBounds(220, 200, 70, 50);

        satu.setBackground(new java.awt.Color(255, 153, 0));
        satu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu);
        satu.setBounds(10, 320, 60, 50);

        sembilan.setBackground(new java.awt.Color(255, 153, 0));
        sembilan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan);
        sembilan.setBounds(150, 200, 60, 50);

        tujuh.setBackground(new java.awt.Color(255, 153, 0));
        tujuh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh);
        tujuh.setBounds(10, 200, 60, 50);

        desimal.setBackground(new java.awt.Color(255, 153, 0));
        desimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desimal.setText(".");
        desimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desimalActionPerformed(evt);
            }
        });
        jPanel1.add(desimal);
        desimal.setBounds(150, 380, 60, 50);

        bagi.setBackground(new java.awt.Color(255, 153, 0));
        bagi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi);
        bagi.setBounds(220, 140, 70, 50);

        hapus.setBackground(new java.awt.Color(255, 153, 0));
        hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hapus.setText("C");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus);
        hapus.setBounds(10, 140, 60, 50);

        persen.setBackground(new java.awt.Color(255, 153, 0));
        persen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        jPanel1.add(persen);
        persen.setBounds(150, 140, 60, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 440);

        setSize(new java.awt.Dimension(318, 481));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
        angka+= "8";
        layar.setText(angka);
    }//GEN-LAST:event_delapanActionPerformed

    private void layarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layarActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        angka+= "1";
        layar.setText(angka);
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
        angka+= "2";
        layar.setText(angka);
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
         angka+= "3";
        layar.setText(angka);   
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
         angka+= "4";
        layar.setText(angka);
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
         angka+= "5";
        layar.setText(angka);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
       angka+= "6";
        layar.setText(angka);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
        angka+= "7";
        layar.setText(angka);
    }//GEN-LAST:event_tujuhActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
         angka+= "9";
        layar.setText(angka);
    }//GEN-LAST:event_sembilanActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
        angka+= "0";
        layar.setText(angka);
    }//GEN-LAST:event_nolActionPerformed

    private void desimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desimalActionPerformed
        // TODO add your handling code here:
         angka+= ".";
           layar.setText(angka);
       
    }//GEN-LAST:event_desimalActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
                   angka1=Double.parseDouble(angka);
        layar.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_kaliActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
            angka1=Double.parseDouble(angka);
        layar.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_kurangActionPerformed

    private void operasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiActionPerformed
        // TODO add your handling code here:
        switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
        case 5:  
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * 1/100;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
            default:
            break;
                    
            }

    }//GEN-LAST:event_operasiActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        // TODO add your handling code here:
    int length = layar.getText().length();
int angka = layar.getText().length()-1;
String store;

if (length>0)
{
    StringBuilder back = new StringBuilder(layar.getText());
    back.deleteCharAt(angka);
    store = back.toString();
    layar.setText(store);
} else {
}
    }//GEN-LAST:event_backspaceActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        angka1 = Double.parseDouble(angka);
        layar.setText("+");
        angka = "";
        pilih = 1;
    }//GEN-LAST:event_tambahActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
         angka1 = Double.parseDouble(angka);
        layar.setText("/");
        angka = "";
        pilih = 4;
    }//GEN-LAST:event_bagiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
     angka2 = 0;
     layar.setText("");
    }//GEN-LAST:event_hapusActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
        angka1 = Double.parseDouble(angka);
        layar.setText("%");
        angka = "";
        pilih = 5;
    }//GEN-LAST:event_persenActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KALKULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KALKULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KALKULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KALKULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new KALKULATOR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
    private javax.swing.JButton bagi;
    private javax.swing.JButton delapan;
    private javax.swing.JButton desimal;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JTextField layar;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton operasi;
    private javax.swing.JButton persen;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
