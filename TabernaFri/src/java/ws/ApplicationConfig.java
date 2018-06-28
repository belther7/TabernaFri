package ws;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author anatoliandrei
 * @author lucasbeccon
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ws.ClienteWS.class);
        resources.add(ws.EventoWS.class);
        resources.add(ws.ProdutoWS.class);
    }
}