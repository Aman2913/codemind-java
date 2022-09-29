import java.util.*;

class battle{
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<(Math.sqrt(n))+1; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    for(int i=1;i<1000000;i++){
        if (prime(a+b+i)){
            System.out.print(i);
            break;
        }
    }
}
}