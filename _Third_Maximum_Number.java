import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
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
                for(int j=0;j<i;j++)
                {
                    arr[j+1]=arr[j];
                    {
                        n--;
                    }
                }
            }
        }
        
        if(n>=3)
        {
            System.out.println(arr[n-3]);
        }
        else{
            System.out.println(arr[n-1]);
        }
    }
}
           