import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaPessoasTest {

    @Test
    void testTodasAsMulheresEstaoNaLista() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", "F"),
                new Pessoa("Maria", "F"),
                new Pessoa("Carlos", "M")
        );

        assertTrue(ListaPessoas.todasAsMulheresEstaoNaLista(pessoas));

        List<Pessoa> pessoasSemMulheres = Arrays.asList(
                new Pessoa("Carlos", "M"),
                new Pessoa("João", "M")
        );

        assertFalse(ListaPessoas.todasAsMulheresEstaoNaLista(pessoasSemMulheres));
    }
}
