package entidade;

import entidade.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T11:51:17")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile CollectionAttribute<Evento, Cliente> cliente;
    public static volatile SingularAttribute<Evento, String> horario;
    public static volatile SingularAttribute<Evento, Double> valor;
    public static volatile SingularAttribute<Evento, Long> id;
    public static volatile SingularAttribute<Evento, String> ministrante;
    public static volatile SingularAttribute<Evento, String> local;

}