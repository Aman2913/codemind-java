import java.util.*;

class check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if (s == 'A' || s == 'a' || s == 'E' ||  s == 'e' || s == 'I' || s == 'i'|| s == 'O' || s == 'o' || s == 'U' || s == 'u'){
            System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        }
    }
}