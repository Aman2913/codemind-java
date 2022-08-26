import java.util.*;

 class electicity{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String customer_id, name;
        customer_id = sc.nextLine();
        name = sc.nextLine();
        int units = sc.nextInt();
        double amt;
        
        if(units<200){
            amt=units*1.20;
            if(amt>400){
                amt=amt+0.15*amt;
            System.out.format("%.2f",amt);
            }
            else{
                System.out.format("%.2f",amt+100);
            }
        }
        else if(units>=200 && units<400){
            amt=units*1.50;
            if(amt>400){
                amt=amt+0.15*amt;
            System.out.format("%.2f",amt);
            }
            else{
                System.out.format("%.2f",amt+100);
            }
        }
        else if(units>=400 && units<600){
            amt=units*1.80;
            if(amt>400){
                amt=amt+0.15*amt;
            System.out.format("%.2f",amt);
            }
            else{
                System.out.format("%.2f",amt+100);
            }
        }
        else{
            amt=units*2.00;
            
            if(amt>400){
                amt=amt+0.15*amt;
                System.out.format("%.2f",amt);
            }
            else{
            amt=amt+100;
            System.out.format("%.2f",amt);
            }
    }
}
}