public class MaxArray {
    public static int fintmax (int[] arr,int n) {
        if (n==1){
        return arr[0];
    }
        int maxOfrest = fintmax(arr, n-1);  
        return Math.max(arr[n-1], maxOfrest);
}
public static void main(String[] args) {
    int[] arr ={7,4,5,2,5,7,9,5};
    int n = arr.length;

    int max = fintmax(arr, n);
    System.out.println("Nilai maksimum dalam Array " + max);
    }
}