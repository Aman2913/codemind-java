import java.util.*;
class tables{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt(), m=sc.nextInt();
        for (int i=1; i<=m;i+=2){
                System.out.format("%d x %d = %d
",n,i,n*i);
            
        }
    }
}