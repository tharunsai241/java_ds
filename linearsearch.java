import java.util.Scanner;
public class linearsearch{
    public static void main(String args[]){
        int n,k,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.print("enter the array element");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element");
        k=sc.nextInt();
       
        for(i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("found at index"+i);
                break;
                }
            }
            if(i==n)
            System.out.print("not found in array");
            }
}




