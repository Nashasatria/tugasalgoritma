package jumpsearch.java;

public class jumpsearch {
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,11,13,15,17,19};
        int target =13;
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

    while (prev < n && arr[Math.min(step,n) - 1]<target){
        prev = step;
        step +=(int) Math.sqrt(n);
    }

    while (prev < Math.min(step,n) && arr[prev]< target){
        prev++;
    }

    if (prev < n && arr [prev] == target){
        System.out.println("Element not found");

    }
  }
}