import java.util.*;

class number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double p,k;
        p=Math.pow(a,b);
        k=p%c;
        int f=(int) Math.round(k);
        System.out.println(f);
    }
}