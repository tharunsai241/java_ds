import java.util.*;

public class insertionsort{
    void sorting(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int k=1;k<a.length;k++){
            int key=a[k];
            int j=k-1;
            while((j>=0) && (a[j]>key)){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static void main(String args[]){
        insertionsort obj=new insertionsort();
        obj.sorting();
    }
}
