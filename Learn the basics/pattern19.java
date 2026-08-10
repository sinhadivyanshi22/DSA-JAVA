import java.util.Scanner;
public class pattern19 {

    public void solve(int n){
        for(int i=0; i<n; i++){
            for(char ch=(char)('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern19 obj = new pattern19();
        obj.solve(n);
        sc.close();
    }
}
