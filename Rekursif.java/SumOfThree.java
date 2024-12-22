public class SumOfThree {
    public static void SumOfThree(int n, int a, int b, int c) {
        if (n ==0) {
            return;
        }else{
            System.out.println(a+" ");
            SumOfThree(n-1, b, c, a+b+c);
        }
        

    }
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 1;
        int c = 1;
        SumOfThree(n, a, b, c);
    }
}