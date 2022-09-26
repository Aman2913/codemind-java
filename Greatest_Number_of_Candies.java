import java.util.*;

class candies{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int b =sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++){
            if (m<a[i]){
                m=a[i];
            }
        }
        int d =m-b;
        for(int i=0;i<n;i++){
            if(a[i]>=d){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}