import java.util.Scanner;
public class BelanjaBuah {
    public static void main(String[] args) {
        String[][] buah = {
            {"apel", "35000"},
            {"jeruk", "50000"},
            {"mangga", "25000"},
            {"dukuh", "15000"},
            {"semangka", "20000"},
        };

        int beliBuah[] = new int[100];
        int Jumlah[] = new int [100];
        int subtotal[] = new int [100];
        String namaBuah [] = new String[100];
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        int i = 0;

        System.out.print("""
            menu :
            1. Beli Buah
            2. Struk Belanja 
            3. Keluar
            """);
            while (lanjut) {
                System.out.print("\nMasukan pilihan: ");
                int pilih = sc.nextLine();
                if(pilih == 1){
                    BeliBuah[i] = sc.nextLine();
                    namaBuah[i] = buah[beliBuah[i]][0];
                    
                    System.out.print("Masukan jumlah: ");
                    Jumlah[i] = sc.nextLine();
                    i++;
                }else if (pilih == 2){
                    System.out.println("\nDaftar Belanja ");
                    System.out.println("========================================");
                    System.out.println("No \t\t Buah \t\t Jumalah \t\t Harga \t\t Subtotal");
                    System.out.println("-----------------------------------------------");
                    int x=i;
                    for (int k = 0; k < namaBuah.length; k++){
                        if (Jumlah[k] != Integer.valueOf(0)) {
                            subtotal[k] = Integer.valueOf(buah[beliBuah[k]][i]) *Jumlah[k];
                            System.out.println((x++) + " \t\t " + buah[beliBuah[k]][0] + " \t\t " + Jumlah[k] + " \t\t " + Integer.valueOf(buah[beliBuah[k]][i]));
                        }

                    }System.out.println("=======================================================");
                    int total=0; 
                    for (int num : subtotal){
                        total += num;
                    }
                    System.out.println("Total: "+total);
                    double diskon = total * 0.15;
                    System.out.println("Diskon(15%): "+(int)diskon);
                    int bayar = total - (int)diskon;
                    System.out.println("bayar: "+bayar);
                }else if(pilih == 3){
                    lanjut = false;                
        }
    }    
sc.close();
    }
}
