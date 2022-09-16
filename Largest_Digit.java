import java.util.*;
import java.lang.*;
import java.io.*;

class largest{
    static void digits(int n){
        int largest=0;
        int smallest=9;
        while(n!=0){
            int r=n%10;
            largest=Math.max(r,largest);
            n=n/10;
        }
        System.out.println(largest);
        }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        digits(a);
    }
    }