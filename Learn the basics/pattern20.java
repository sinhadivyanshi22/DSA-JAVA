import java.util.Scanner;
public class pattern20{
    public void solve(int n){
        int ins=2*n-2;

        //upperhalf
        for(int i=1;i<=2*n-1; i++){
            int star=i;
            if(i>n) star=2*n-i;
            
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            for(int j=1;j<=ins; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n) ins-=2;
            else ins+=2;
        }
            
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern20 obj=new pattern20();
        obj.solve(n);
        sc.close();
    }
}