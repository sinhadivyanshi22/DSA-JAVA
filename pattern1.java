// ****
// ****
// ****
// ****
class pattern1{
    void solve(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=4;
        pattern1 obj = new pattern1();
        obj.solve(n);
    }
}