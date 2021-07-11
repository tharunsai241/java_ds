import java.util.Scanner;

public class binarysearch {
    int search(int arr[],int k){
        int l=0,r=arr.length-1;
        while(l<=r){
           int mid=(l+r)/2;

           if(arr[mid]==k)
            return mid;
        
            if(arr[mid]<k)
            l=mid+1;

            else
            r=mid+1;
        }
        return -1;
    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.print("enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the arrray elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element to find");
        k=sc.nextInt();
        binarysearch bs=new binarysearch();
        int result=bs.search(arr,k);
        if(result==-1)
        System.out.println("not present in the array");
        else
        System.out.println("present at "+ k + "index");
    }
}
