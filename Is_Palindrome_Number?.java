import java.util.*;

class palindrome{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int rev=0;
    int temp;
    temp=n;
    while(n!=0){
        int p = n%10;
        rev=rev*10+p;
        n/=10;
    }
    if (temp!=rev){
        System.out.print('1');
    }
    else{
        System.out.print('2');
    }
    }
}