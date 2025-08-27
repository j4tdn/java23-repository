package connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf;
    static {
        emf = Persistence.createEntityManagerFactory("lesson18PU");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
