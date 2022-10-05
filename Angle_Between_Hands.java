import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        double h=(time.charAt(0)-48)*10+(time.charAt(1)-48);
        double m=(time.charAt(3)-48)*10 +(time.charAt(4)-48);
        double f=11*m/2 -30*h;
        if (f<0){
            f+=360;
        
        }
        if (f>180){
            f=360-f;
            
        }
        System.out.print(f);
    }
}