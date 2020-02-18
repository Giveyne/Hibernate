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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_product_category", referencedColumnName = "id")
    private Product product;

    public ProductCategory() {
        super();
    }

    public ProductCategory(Long id) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
