import java.util.*;

class conversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n, i=0,d=0,a=0;
        n= sc.nextLong();
        while(n!=0){
            d+=n%10*Math.pow(8,i);
            n/=10;
            i++;
        }
        i=1;
        while(d!=0){
            a+=(d%2)*i;
            d/=2;
            i*=10;
        }
        System.out.println(a);
    }
}