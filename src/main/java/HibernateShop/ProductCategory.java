package HibernateShop;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_category")
public class ProductCategory extends Shop {


    private static final long serialVersionUID = -2359542086640097196L;
    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "count")
    private int count;

    @OneToMany(mappedBy = "productcategory")
    private Set<Product> products = new HashSet<Product>();

    public ProductCategory(){
        super();
    }
    public ProductCategory(Long id){
        super(id);
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

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
