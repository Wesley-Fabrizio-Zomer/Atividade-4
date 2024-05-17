import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura da pessoa em metros: ");
            double altura = scanner.nextDouble();
            double pesoIdeal = (72.7 * altura) - 58;

            System.out.println("Digite o sexo da pessoa (1-Feminino, 2- Masculino): ");
            int sexo = scanner.nextInt();

            if (sexo == 1) {
                System.out.println("O peso ideal para uma mulher com " + altura + "m de altura é: " + pesoIdeal + "kg");
            } else if (sexo == 2) {
                System.out.println("O peso ideal para um homem com " + altura + "m de altura é: " + pesoIdeal + "kg");
            } else {
                System.out.println("Opção de sexo inválida. Por favor, tente novamente.");
                i--;
            }
        }
        scanner.close();
    }
}