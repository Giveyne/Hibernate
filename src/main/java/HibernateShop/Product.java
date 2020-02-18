package HibernateShop;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product extends Shop{

    private static final long serialVersionUID = 443452870072785108L;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
    private Set<ProductCategory> productcategories = new HashSet<ProductCategory>();

    @Column(name = "count")
    private Integer count;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "products")
    private Set<Order> orders = new HashSet<Order>();

    public Product(){
        super();
    }
    public Product(Long id){
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<ProductCategory> getProductcategories() {
        return productcategories;
    }

    public void setProductcategories(Set<ProductCategory> productcategories) {
        this.productcategories = productcategories;
    }

    @Override
    public String toString() {
        return "Id = " + super.getId () +"Product{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", productcategories=" + productcategories +
                ", count=" + count +
                ", orders=" + orders +
                '}';
    }
}
