import java.util.Scanner;
class PrintN{
    public void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintN obj=new PrintN();
        obj.print(n);
        sc.close();
    }
}