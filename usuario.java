import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a annotation Tabela
@Retention(RetentionPolicy.RUNTIME) // A annotation estará disponível em tempo de execução
@Target(ElementType.TYPE) // A annotation pode ser aplicada a classes
public @interface usuario {
    String nome(); // O atributo que receberá o nome da tabela
}
@usuario(nome = "usuarios")
public class Usuario {
    private String nome;
    private String email;

   
}
