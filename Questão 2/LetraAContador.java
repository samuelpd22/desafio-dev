import java.util.Scanner;

public class LetraAContador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");

        String frase = scanner.nextLine();

        int countA = Service.ContadorLetraA(frase);

        System.out.println("A letra 'a' aparece " + countA + " vezes na string.");
        scanner.close();
    }
}
