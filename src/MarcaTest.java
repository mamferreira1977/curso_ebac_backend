import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setCodigo("A1");
        marca.SetValor("200");
        marca.setNome("Ferrari");
        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
