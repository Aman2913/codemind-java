import java.util.*;

class spy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0,product=1;
        int d;
        int n = sc.nextInt();
        while (n>0){
            d=n%10;
            sum=sum+d;
            product=product*d;
            n/=10;
        }
        if (sum==product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}