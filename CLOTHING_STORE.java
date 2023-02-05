import java.util.*;
class store{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                c++;
                i+=1;
            }
        }
        System.out.println(c);
    }
}