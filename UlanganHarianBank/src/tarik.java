
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
class tarik {
    private int saldo;
    void ambil(int ye, int k) {
        if (k%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi lagi", "Transaksi Gagal", 0);
        else{
            if(k>ye)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi \nSilahkan lakukan penyetoran","Transaksi Gagal", 0);
            else if(k<50000)
                JOptionPane.showMessageDialog(null,
                    "Besaran minimal pengambilan tunai adalah Rp. 50000, 00", "Transaksi Gagal",0);
            else{
                saldo = ye-k;
                JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar :"+saldo);
                if(ye<=50000)
                    JOptionPane.showMessageDialog(null,"Saldo minimal Rp. 50000,00 Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
            }
        }
           
    }

    int getsaldo() {
         return saldo;
    }
    
}
