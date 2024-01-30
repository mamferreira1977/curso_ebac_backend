import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float nota;

        System.out.println("Informe sua nota:");
        nota1=ler.nextFloat();
        System.out.println("Informe sua nota");
        nota2=ler.nextFloat();
        System.out.println("Informe sua nota");
        nota3=ler.nextFloat();
        System.out.println("Informe sua nota");
        nota4=ler.nextFloat();

        nota= (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média das notas é " + nota);

    }
}