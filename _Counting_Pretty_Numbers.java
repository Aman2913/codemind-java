import java.util.*;

class numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int c=0;
            int a =sc.nextInt(),b=sc.nextInt();
            for(int j=a;j<=b;j++){
                if(j%10==2 || j%10==3 || j%10==9){
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}