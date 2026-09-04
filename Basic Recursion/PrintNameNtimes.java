import java.util.Scanner;
public class PrintNameNtimes{
    public static void printName(String name, int i,int n){
        if(i>n) return;
        else{
            System.out.println(i+" "+name);
            i++;
            printName(name,i,n);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int n=sc.nextInt();
        printName(name,1,n);
        sc.close();
    }
}