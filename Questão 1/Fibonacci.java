import java.util.Scanner;

public class Fibonacci {


public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


    System.out.print("Informe um número: ");

    int number = scanner.nextInt();

    if (Service.isFibonacci(number)) {
        System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
    }
    scanner.close();
}
}
