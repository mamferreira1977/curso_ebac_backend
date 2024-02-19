import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite nomes separados por vírgulas: ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }
        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.print("Digite os nomes e sexos separados por traço (Ex: Maria-F,Jose-M): ");
        String inputNomesSexos = scanner.nextLine();
        String[] nomesSexos = inputNomesSexos.split("-|,");


        String[] nomesHomens = new String[nomesSexos.length / 2];
        String[] nomesMulheres = new String[nomesSexos.length / 2];
        int contadorHomens = 0;
        int contadorMulheres = 0;


        for (int i = 0; i < nomesSexos.length; i += 2) {
            String nome = nomesSexos[i];
            String sexo = nomesSexos[i + 1];

            if (sexo.equalsIgnoreCase("M")) {
                nomesHomens[contadorHomens++] = nome;
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesMulheres[contadorMulheres++] = nome;
            } else {
                System.out.println("Sexo inválido para o nome: " + nome);
            }
        }
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nNomes de Homens:");
        for (int i = 0; i < contadorHomens; i++) {
            System.out.println(nomesHomens[i]);
        }

        System.out.println("\nNomes de Mulheres:");
        for (int i = 0; i < contadorMulheres; i++) {
            System.out.println(nomesMulheres[i]);
        }

        scanner.close();
    }
}
