import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class AcessoriosTest {

    private IAcessoriosDao acessoriosDao;

    public AcessoriosTest() {
        acessoriosDao = new AcessoriosDao();
    }

    @Test
    public void cadastrar() {
        Acessorios acessorios = new Acessorios();
        acessorios.setCodigo("A1");
        acessorios.setValor("100");
        acessorios.setNome("Ferrari");
        acessorios= acessoriosDao.cadastrar(acessorios);

        assertNotNull(acessorios);
        assertNotNull(acessorios.getId());
    }
}