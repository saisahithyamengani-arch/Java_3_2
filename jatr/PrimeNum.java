
import java.util.Scanner;
public class PrimeNum {
    public static void primenumber(int number) {
        if(number<=1){
            System.out.println("number is not a prime number" + number);
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i <number; i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("it is a prime number" + number);
        }
        else{
            System.out.println("not a prime" + number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        primenumber(num);
    }
}
