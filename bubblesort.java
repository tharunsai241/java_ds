import java.util.*;

public class bubblesort{
    void sorting()
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    int temp=0;
    for(int k=0;k<a.length;k++)
    {
        for(int j=0;j< a.length-k-1; j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            
        }
    }
    for(int i=0;i<n;i++)
    {
    System.out.print(a[i]);
    }
    
}

public static void main(String args[]){
    bubblesort obj=new bubblesort();
    obj.sorting();
    
   // sc.close();
}
}

