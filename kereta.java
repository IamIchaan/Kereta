package kereta;

/**
 *
 * @author Dain
 */
import java.util.Scanner;
class TiketKA{
    String Menu="";
    int Pilihan, JumlahTiket,Harga;
    int Total=0;
    Scanner scan = new Scanner(System.in);
    
    void Menu(){
        System.out.println("             PEMESANAN TIKET KERETA API               ");
        System.out.println("            ----------------------------              ");
        System.out.println("            Daftar Harga Tiket Kereta Api             ");
        
        System.out.println("NO. NAMA KERETA DAN TUJUAN                HARGA TIKET ");
        System.out.println("1.  MATARMAJA TANAHABANG ke BANDUNG       Rp 55.000.- ");
        System.out.println("2.  MATARMAJA TANAHABANG ke TEGAL         Rp 65.000.- ");
        System.out.println("3.  BIMA TANAHABANG ke KEBUMEN            RP 70.000.- ");
        System.out.println("4.  BIMA TANAHABANG ke LEMPUYANGAN        RP 85.000.- ");
        System.out.println("5.  BENGAWAN TANAHABANG ke KLATEN         RP 75.000.- ");
        System.out.println("6.  BENGAWAN TANAHABANG ke MADIUN         RP 80.000.- ");
        System.out.println("7.  ARJOLAWU TANAHABANG ke SURABAYA       RP 90.000.- ");
        System.out.println("-----------------------------");
    System.out.println("Melakukan Pemesanan Tiket Kereta Api ");
    System.out.print("Masukan Nomor Tiket Yang Ingin Anda Pesan :");
    Pilihan = scan.nextInt();
     switch (Pilihan){  
        case 1: 
    System.out.println("Pesanan Anda MATARMAJA TANAHABANG ke BANDUNG       Rp 55.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 55000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
     System.out.println("Segera Datang Ke Dianmart atau Aprilnmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 2: 
    System.out.println("Pesanan Anda MATARMAJA TANAHABANG ke TEGAL         Rp 65.000.- ");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 65000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               "); 
    break;                     
        case 3:
    System.out.println("Pesanan Anda BIMA TANAHABANG ke KEBUMEN            RP 70.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 70000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 4:
    System.out.println("Pesanan Anda BIMA TANAHABANG ke LEMPUYANGAN        RP 85.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 85000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 5: 
    System.out.println("Pesanan Anda BENGAWAN TANAHABANG ke KLATEN         RP 75.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 75000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 6: 
    System.out.println("Pesanan Anda BENGAWAN TANAHABANG ke MADIUN         RP 80.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 80000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 7: 
    System.out.println("Pesanan Anda ARJOLAWU TANAHABANG ke SURABAYA       RP 90.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 90000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;  
                 
            } 
    
}       
    
}
public class kereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiketKA TiketKereta = new TiketKA();
        int Total;
        do{
         TiketKereta.Menu();
            switch (TiketKereta.Pilihan){
                    case 1 :
                        TiketKereta.Menu ();
                        break;          
                        
    }
          }while(TiketKereta.Total<0);
    }}