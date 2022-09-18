import java.util.*;
class prime{
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int c=0;
        int b= sc.nextInt();
        for(int i=a;i<=b+1;i++){
            if (prime(i)){
                c+=1;
        }
        }
        System.out.println(c);
    }
    
}