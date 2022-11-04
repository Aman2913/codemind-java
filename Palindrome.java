import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp,p,rev=0;
        temp=n;
        while(temp!=0){
            p=temp%10;
            rev=rev*10+p;
            temp=temp/10;
        }
        if (rev==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}