import java.util.Scanner;
public class countsort{
    void sort(int arr[],int n){
        //creating an array with n+1 
        int[] arr1=new int[n+1];
        int x=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>x)
                x=arr[i]; //getting the max value (greatest element)
        }
        //creating an array with max value+1
        int[] count_arr=new int[x+1];
        
        //assigning all 0s to the array
        for(int i=0;i<x;i++){
            count_arr[i]=0;
        }

        //store the count of each element at their respective index in count_arr 
        for(int i=0;i<n;i++){
            count_arr[arr[i]]++;
        }
        //calculating the cumulative sum of the count array
        for(int i=1;i<=x;i++){
            count_arr[i]+=count_arr[i-1];
        }

        //finding the index of each element of the original array in the count_arr.gives the cumulative count and place the element at the index 
        for(int i=n-1;i>=0;i--){
            arr1[count_arr[arr[i]]-1]=arr[i];
            count_arr[arr[i]]--;
        }
        //copy the values to the original array
        for(int i=0;i<n;i++){
            arr[i]=arr1[i];
        }

    }
    void display(int arr[]){
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+"");
           }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countsort cs=new countsort();
        cs.sort(arr, n);
        cs.display(arr);
    }
}