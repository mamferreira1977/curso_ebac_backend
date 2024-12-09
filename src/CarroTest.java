import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Acessorios carro = new Acessorios();
        carro.setCodigo("A1");
        carro.setValor("100");
        carro.setNome("Ferrari");
        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}