import java.util.*;
public class SumOfArray{
    public int sum(int arr[],int n){
        if(n==0) return 0;
        else return arr[n-1]+sum(arr,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SumOfArray obj=new SumOfArray();
        int sum=obj.sum(arr,n);
        System.out.println("Sum of array is: "+sum);
        sc.close();
    }
}