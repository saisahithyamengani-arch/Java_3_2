import java.util.Scanner;

public class Even {
    public static void evenorodd(int number){
        if(number == 0){
            System.out.println("Invalid");
        }
        else if(number % 2 == 0){
            System.out.println("even number: "+number);
        }
            else{
                System.out.println("odd: "+number);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        evenorodd(num);
    }
}
