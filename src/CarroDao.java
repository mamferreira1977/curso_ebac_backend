import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class CarroDao implements ICarroDao{

    @Override
    public Acessorios cadastrar(Acessorios carro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("Oficina");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return carro;
    }

}
