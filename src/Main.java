import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas;
        System.out.print("Digite a quantidade de pessoas: ");
        quantidadePessoas = scanner.nextInt();
        scanner.nextLine();

        String []nome = new String[quantidadePessoas];
        char[] sexo= new char[quantidadePessoas];
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nome[i] = scanner.nextLine();

            System.out.print("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            sexo[i] = scanner.nextLine().toUpperCase().charAt(0);        }

       System.out.println("\nGrupo Masculino:");
        for (int i = 0; i < quantidadePessoas; i++) {
            if (sexo[i] == 'M') {
                System.out.println(nome[i]);
            }
        }

        System.out.println("\nGrupo Feminino:");
        for (int i = 0; i < quantidadePessoas; i++) {
            if (sexo[i] == 'F') {
                System.out.println(nome[i]);
            }
        }

        scanner.close();
    }
}


