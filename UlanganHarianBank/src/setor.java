
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
class setor {
    private int saldo;
    
    public void tabung(int ye, int k) {
      if (k%100!=0)
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali!",
                    "Transaksi Gagal", 0);
        else if (k<50000)
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor tunai adalah Rp. 50000, 00", "ERROR",0);
        else if (k>=50000){
            saldo = ye+k;
            JOptionPane.showMessageDialog(null, 
                    "Saldo Anda saat ini sebesar :" + saldo);
    }
    }

    int getsaldo() {
        return saldo;
    }
    
}
