public class AngkaMundur {
    public static void printAngkaMundur(int n) {
        if (n<1) {
            return;
        }else{
            System.out.print(n+" ");
            printAngkaMundur(n-1);
        }

    }

    public static void main(String[] args) {
        int angka = 5;
        printAngkaMundur(angka);
    }
}
