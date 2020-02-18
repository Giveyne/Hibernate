package HibernateShop;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Shop implements Serializable {

    private static final long serialVersionUID = 5502793965561857432L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public Shop(){

    }
    public Shop(Long id){
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
