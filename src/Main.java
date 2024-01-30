import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        String input = scanner.nextLine();

        int valorPrimitivo = Integer.parseInt(input);


        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}










