package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anatoliandrei
 * @author lucasbeccon
 */
public class JPAUtil {
    private static String PUNAME = "TabernaPU";
    private static EntityManagerFactory factory = 
            Persistence.createEntityManagerFactory(PUNAME);
   
    public static EntityManager getManager(){
        return (factory.createEntityManager());
    }
    
}
