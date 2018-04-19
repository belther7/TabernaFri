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

//OneToOne
//@Entity
@XmlRootElement
@Embeddable
public class Endereco implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String pais;
    private String estado;
    private String logradouro;
    private int numero;
    private String complemento;
    private int cep;
}