import java.util.*;
public class oddelements{
    public int odd(int arr[],int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                c++;
            }
        }
        return c;
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
        oddelements obj=new oddelements();
        System.out.println(obj.odd(arr,n));
        sc.close();
    }
}