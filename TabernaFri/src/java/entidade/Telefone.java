package entidade;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Beccon
 */

//OneToMany
//@Entity
@XmlRootElement
@Embeddable
public class Telefone implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private int ddd;
    private int numero;
}