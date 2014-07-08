package modelo;
// Generated 08-jul-2014 18:39:14 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Puesto generated by hbm2java
 */
@Entity
@Table(name="puesto"
    ,catalog="teide2014"
)
public class Puesto  implements java.io.Serializable {


     private Integer idPuesto;
     private String nombre;

    public Puesto() {
    }

    public Puesto(String nombre) {
       this.nombre = nombre;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPuesto", unique=true, nullable=false)
    public Integer getIdPuesto() {
        return this.idPuesto;
    }
    
    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    
    @Column(name="nombre", nullable=false, length=100)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

