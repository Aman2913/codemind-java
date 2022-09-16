import java.util.*;

class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=0, b=1;
        int c =a+b;
        if (n==0){
            System.out.println("True");
        }
        while (c<n){
            c=a+b;
            a=b;
            b=c;
        }
        if (c==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}