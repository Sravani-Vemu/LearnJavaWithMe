package coding;

import java.util.Scanner;

public class PrimeNumber {
    //main logic
    public static int checkPrime(int n){
        int flag = 0;
        for(int i =1;i<=n;i++){
            if(n%i == 0){
                flag=flag+1;
            }
        }
        if(flag == 2){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void checkPrimeNumbersInRange(int n1,int n2){
        //main logic
        for(int i = n1;i<=n2;i++){
            int res = checkPrime(i);
            if(res == 1){
                System.out.print(i + " ");
            }
            else{
                continue;
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int choice, n;
        //below are the two cases to identify the prime numbers from a given range or to check whether the number is prime or not
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Below are the two choices that you can perform\n1. Check whether the given number is prime or not\n2. Check the prime numbers in the given range\n3. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Your chosen option is that to check whether the given number is prime or not");
                System.out.println("Enter n value: ");
                n = sc.nextInt();
                int result = checkPrime(n);
                if (result == 1) {
                    System.out.println("Your number " + n + " is a prime number :)");
                } else {
                    System.out.println("Your number " + n + " is not a prime number :(");
                }
            }
            else if (choice == 2) {
                System.out.println("Enter initial number: ");
                int initial = sc.nextInt();
                System.out.println("Enter last number: ");
                int final_r = sc.nextInt();
                System.out.println("You have chosen to check prime numbers in the range of " + initial + " to " + final_r);
                checkPrimeNumbersInRange(initial, final_r);
            }
            else if (choice == 3) {
                System.out.println("Bye!");
                break;
            }
            else{
                System.out.println("Please enter a valid choice number i.e 1 or 2. Else enter '3' to exit.");

            }
        }
    }
}
