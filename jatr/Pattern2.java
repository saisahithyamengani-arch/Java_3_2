public class Pattern2 {
    public static void patrev(int num) {
        for(int i = 1;i<=num; i++ ){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patrev(9);
    }
}