
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aqshal-kun
 */
public class base extends javax.swing.JFrame {

     String uye, uyee;
    int z, pin = 1234, a = 3;
    int t, s, tab = 0;
    /**
     * Creates new form base
     */
    public base() {
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

        jLabel2 = new javax.swing.JLabel();
        saldo = new javax.swing.JButton();
        Setor = new javax.swing.JButton();
        Penarikan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Silahkan Pilih Transaksi Anda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 110, 250, 70);

        saldo.setBackground(new java.awt.Color(255, 255, 255));
        saldo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        saldo.setText("Lihat Saldo");
        saldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saldoMouseClicked(evt);
            }
        });
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(190, 260, 140, 50);

        Setor.setBackground(new java.awt.Color(255, 255, 255));
        Setor.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Setor.setText("Menabung");
        Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetorActionPerformed(evt);
            }
        });
        getContentPane().add(Setor);
        Setor.setBounds(190, 170, 140, 50);

        Penarikan.setBackground(new java.awt.Color(255, 255, 255));
        Penarikan.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Penarikan.setText("Penarikan");
        Penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenarikanActionPerformed(evt);
            }
        });
        getContentPane().add(Penarikan);
        Penarikan.setBounds(460, 170, 140, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4.setText("Bantuan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(460, 260, 140, 50);

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(350, 330, 90, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aqshal-kun\\Documents\\Resource\\4.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 440);

        setBounds(0, 0, 790, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_saldoActionPerformed

    private void saldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoMouseClicked
        // TODO add your handling code here:
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BRI - SAWOJAJAR",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI - SAWOJAJAR, ambil kartu ATM Anda.");
                System.exit(0);
            }

    }//GEN-LAST:event_saldoMouseClicked

    private void SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetorActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
            uyee = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran : " ); //menabung
            s = Integer.parseInt(uyee);
            setor hasil = new setor();
            hasil.tabung(tab, s);
            tab =hasil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM BRI - SAWOJAJAR",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI - SAWOJAJAR, ambil kartu ATM Anda.");
                System.exit(0);
            }
    }//GEN-LAST:event_SetorActionPerformed

    private void PenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenarikanActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
            uyee = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //pengambilan
            t = Integer.parseInt(uyee);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab =mengambil.getsaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BRI - SAWOJAJAR",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI - SAWOJAJAR, ambil kartu ATM Anda.");
                System.exit(0);
            }
    }//GEN-LAST:event_PenarikanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         z=JOptionPane.showConfirmDialog(null,"Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2] Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ","INFO",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BRI - SAWOJAJAR, ambil kartu ATM Anda.");
                System.exit(0);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"SILAHKAN AMBIL KARTU ATM ANDA !","TERIMAKASIH",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Penarikan;
    private javax.swing.JButton Setor;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton saldo;
    // End of variables declaration//GEN-END:variables
}