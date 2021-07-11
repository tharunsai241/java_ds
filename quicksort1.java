import java.util.Scanner;
public class quicksort1 {

    int sorting(int [] arr,int low,int high)
    {
        int pivot=arr[high];
        int a=(low-1);
        for(int i=low; i<high; i++)
        {
            if(arr[i]<pivot){
                a++;
                int temp=arr[a];
                arr[a]=arr[i];
                arr[i]=temp;
            }
        }
            int temp=arr[a+1];
            arr[a+1]=arr[high];
            arr[high]=temp;
        return a+1;
    }
    public void sort(int [] arr,int low,int high)
    {   
        if(low<high){
            int p=sorting(arr, low, high);
            sort(arr, low, p-1);
            sort(arr,p+1,high);
        }
    }
    static void display(int [] arr){
        int t=arr.length;
        for(int i=0;i<t;i++){
            System.out.print(arr[i]+"");
        }
       // System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort1 obj=new quicksort1();
        obj.sort(arr,0,arr.length-1);
        display(arr);
    }
}
