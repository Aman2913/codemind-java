import java.util.*;

class elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), k= sc.nextInt();
        int [] a = new int[n];
        int count=0;
        for(int  i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%k==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}