import java.util.List;

public class ListaPessoas {

    public static boolean todasAsMulheresEstaoNaLista(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            if ("F".equals(pessoa.getSexo())) {
                return true; // Encontrou uma mulher
            }
        }
        return false; // Nenhuma mulher encontrada
    }
}
