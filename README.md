# tugasalgoritma
public class kembalian {
    public static void main(String[] args)   {
       double Harga,Jumlah,Total,Bayar,kembalian; ;
       Harga = 28000.0;
       Jumlah = 2.5;
       Total = Harga * Jumlah;
       Bayar = 100000.0;
       kembalian = Bayar - Total ;
       System.out.println("Harga telur perkilo: Rp."+Harga);
       System.out.println("Jumlah telur: "+Jumlah+" Kg");
       System.out.println("Total harga : Rp."+Total);
       System.out.println("Uang yang diberikan: Rp."+Bayar);
       System.out.println("Uang kembalian: "+kembalian);
    }
}
