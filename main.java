import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a annotation Tabela
@Retention(RetentionPolicy.RUNTIME) // A annotation estará disponível em tempo de execução
@Target(ElementType.TYPE) // A annotation pode ser aplicada a classes
public @interface Tabela {
    String nome(); // O atributo que receberá o nome da tabela
}
public class Main {
    public static void main(String[] args) {
        // Obtendo a classe Usuario
        Class<Usuario> usuarioClass = Usuario.class;

        // Verificando se a annotation Tabela está presente
        if (usuarioClass.isAnnotationPresent(Tabela.class)) {
            // Obtendo a annotation Tabela
            Tabela tabela = usuarioClass.getAnnotation(Tabela.class);
            // Imprimindo o nome da tabela
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A annotation Tabela não está presente na classe Usuario.");
        }
    }
}


