import java.util.*;

class neon{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int p= n*n;
        int sum=0,d;
        while (p>0){
            d=p%10;
            sum=sum+d;
            p/=10;
        }
        if (sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}