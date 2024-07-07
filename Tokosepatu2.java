
package Tokosepatu;

import java.util.Scanner;
,util,Scanner;

public class Tokosepatu2 extends Tokosepatu1 {
    
    public int pilihan,beli,total,kembalian,pembayaran;
    private double diskon;
    private String jenis;
    
    Scanner in = new Scanner (System.in);
    public int beli (){
        return this.beli;
    }
    public void setbeli (int beli){
        this.beli = beli;
    }
    
    void transaksi(){
        
        System.out.println("Format pesanan diterima               ");
        System.out.println("=== Silahkan masukkan pesanan anda ===");
        System.out.println("Harga sepatu di OmahShoes             ");
        System.out.println("1.Nike SB dunk Rp.600,000,-             ");
        System.out.println("2.Skechers Rp.1,200,000,-               ");
        System.out.println("3.Air jordan 1 retro high Rp.2,200,000,-");
        System.out.println("4.Air force 1 Rp.1,500,000,-            ");
        System.out.println("5.Yeezy 350 V2 Rp.2,000,000,-           ");
        System.out.println("=========================================");
        System.out.println("Masukkan pilihan anda");
        int pilihan = in.nextInt();
        
        switch(pilihan){
            case 1:
                this.jenis="Nike SB dunk";
                System.out.println("PESANAN ANDA : Nike SB dunk");
                System.out.print("JUMLAH PESANAN : ");
                beli=in.nextInt();
                break;
            case 2:
                this.jenis="Skechers";
                System.out.println("PESANAN ANDA : Skechers");
                System.out.print("JUMLAH PESANAN : ");
                beli=in.nextInt();
                break;
            case 3:
                this.jenis="Air jordan 1 retro high";
                System.out.println("PESANAN ANDA : Air jordan 1 retro high");
                System.out.print("JUMLAH PESANAN : ");
                beli=in.nextInt();
                break;
            case 4:
                this.jenis="Air force 1";
                System.out.println("PESANAN ANDA : Air force 1");
                System.out.print("JUMLAH PESANAN : ");
                beli=in.nextInt();
                break;
            case 5:
                this.jenis="Yeezy 350 V2";
                System.out.println("PESANAN ANDA : Yeezy 350 V2");
                System.out.print("JUMLAH PESANAN : ");
                beli=in.nextInt();
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
    }
    void diskon(){
        if(this.jenis.equals("Nike SB dunk")){
            this.total=600000*this.beli;
            this.diskon=total*0.10;
        }
        else if (this.jenis.equals("Skechers")){
            this.total=1200000*this.beli;
            this.diskon=total*0.10;
        }
        else if (this.jenis.equals("Air jordan 1 retro high")){
            this.total=2200000*this.beli;
            this.diskon=total*0.10;
        }
        else if (this.jenis.equals("Air force 1")){
            this.total=1500000*this.beli;
            this.diskon=total*0.10;
        }
        else if (this.jenis.equals("Yeezy 350 V2")){
            this.total=2000000*this.beli;
            this.diskon=total*0.10;
        }else{
            this.total=2500000*this.beli;
            this.diskon=total*0.10;
        }
        System.out.println("=================================================");
        System.out.println("                Nota pembelian anda              ");
        System.out.println("=================================================");
        System.out.println("Selamat anda mendapatkan diskon potongan 10%     ");
        System.out.println("Total pembayaran : Rp. " +this.total);
        System.out.println("Total + diskon : Rp. "+(this.total-=this.diskon));
        do{
            System.out.print("Masukkan uang pembayaran anda : Rp. ");
            pembayaran = in.nextInt();
        }while(pembayaran<total);
        kembalian = (int) (pembayaran - diskon);
        System.out.println("Uang kembalian anda : Rp. "+(this.pembayaran-this.total));
        System.out.println("Terima kasih telah berbelanja di OmahShoes ");
        System.out.println("=======================================================");
    }
    void nondiskon(){
        if(this.jenis.equals("Nike SB dunk")){
            this.total=600000*this.beli;
        }
        else if(this.jenis.equals("Skechers")){
            this.total=1200000*this.beli;
        }
        else if(this.jenis.equals("Air jordan 1 retro high")){
            this.total=2200000*this.beli;
        }
        else if(this.jenis.equals("Air force 1")){
            this.total=1500000*this.beli;
        }
        else if(this.jenis.equals("Yeezy 350 V2")){
            this.total=2000000*this.beli;
        }else{
            this.total=2500000*this.beli;
        }
        System.out.println("===============================================");
        System.out.println("              Nota pembelian anda              ");
        System.out.println("===============================================");
        System.out.println("Total pembayaran anda : Rp. "+this.total);
        do{
            System.out.print("Masukkan uang anda : Rp. ");
            pembayaran=in.nextInt();
        }while(pembayaran<total);
        System.out.println("Kembalian anda : Rp. "+(this.pembayaran-this.total));
        System.out.println("Terima kasih telah berbelanja di OmahShoes");
        System.out.println("===================================================");
    }
}
