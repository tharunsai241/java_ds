import java.util.Scanner;
public class selectionsort 
{
    public  void sorting()
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       // int min_index=0;
        for(int j=0;j<n;j++)
        {
            int min_index=j;
            for(int k=j+1;k<n;k++)
            {
                if(a[k]<a[min_index])
                {
                    min_index=k;
                }
            int temp=a[j];
            a[j]=a[min_index];
            a[min_index]=temp;
            }
        }
        for (int i=0; i<a.length; i++)
        {
        System.out.println(a[i]+" ");
        }
}

    public static void main(String args[])
    {
        
        selectionsort obj=new selectionsort();
        obj.sorting();
    }
}











