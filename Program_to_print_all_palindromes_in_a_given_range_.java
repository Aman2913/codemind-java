import java.util.*;

class sol{
    
    static boolean palin(int n)
    {
        int temp = n;
        int rev =0 ;
        while (temp!=0)
        {
            rev = rev *10 + temp%10;
            temp/=10;
        }
        if (rev==n)
        {
            return true;
        }
        return false;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();
    for (int i=a; i<=b;i++){
        if (palin(i)){
            System.out.print(i+" ");
        }
    }
}
}