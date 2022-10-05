import java.util.Scanner;
class SumNoLoop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[ ] ar= new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        System.out.println(sum(ar, 0));
    }

    public static int sum(int[] arr, int index) {
        if (arr.length <= index) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);

    }
}