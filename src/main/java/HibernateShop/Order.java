package HibernateShop;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orderMain")
public class Order extends Shop{

    private static final long serialVersionUID = 1171631633755429852L;

    @OneToMany(mappedBy = "order")
    private Set<Customer> customers = new HashSet<Customer>();

    @OneToMany(mappedBy = "order")
    private Set<Saller> sallers = new HashSet<Saller>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "order_product",
            joinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private Set<Product> products = new HashSet<Product>();

    @Column(name = "price")
    private BigDecimal price;

    public Order (){
        super();
    }
    public Order(Long id){
        super(id);
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Saller> getSallers() {
        return sallers;
    }

    public void setSallers(Set<Saller> sallers) {
        this.sallers = sallers;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customers=" + customers +
                ", sallers=" + sallers +
                ", products=" + products +
                ", price=" + price +
                '}';
    }
}
