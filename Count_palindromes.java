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
    int c=0;
    int []arr = new int [a];
    for(int k =0; k<a;k++){
        arr[k]=sc.nextInt();
        if (palin(arr[k])){
            c+=1;
        }
    }
    System.out.println(c);
}
}