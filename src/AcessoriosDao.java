import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AcessoriosDao implements IAcessoriosDao{

    @Override
    public Acessorios cadastrar(Acessorios acessorios) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("Oficina");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorios);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return acessorios;
    }

}

