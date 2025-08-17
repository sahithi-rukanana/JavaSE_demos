package basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner scanner = new Scanner(System.in); // input from keyboard
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        scanner.close();

    }
}
