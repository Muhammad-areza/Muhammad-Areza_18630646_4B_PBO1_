
package Tokosepatu;

public class Tokosepatu {

    
    public static void main (String[] args){
        Tokosepatu1 input = new Tokosepatu1();
        Tokosepatu2 objek = new Tokosepatu2();
        input.cetak();
        objek.transaksi();
        if (objek.beli>=2){
            objek.diskon();
        }
        else{
            objek.nondiskon();
        }
}
}
