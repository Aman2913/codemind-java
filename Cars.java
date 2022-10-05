import java.util.*;
class cars{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        if(n1>n2)
        System.out.println(-1);
        else if((n1+x)<n2)
        System.out.println(1);
        else
        System.out.println(2);
    }
}