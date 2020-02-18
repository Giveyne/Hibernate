import HibernateShop.Product;
import HibernateStudy.HibernateUtil;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;





public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();



        List <Product> products = null;
        BigDecimal price = null;
        int [] arr = {1, 2, 3, 4};
        try{
            session.beginTransaction();
//            SQLQuery queryCreate = session
//                    .createSQLQuery("UPDATE product set title = :title where id = :id");
//            защита от иньекций
//            queryCreate.setParameter("title", "ytrewq");
//            queryCreate.setParameter("id", "1");
//            queryCreate.executeUpdate();
//
//            SQLQuery query = session
//                    .createSQLQuery("select * from product");
//                         //   "Insert into product (count, description, price, title) values('1', 'good steel hammer with birch grip', '45', 'Steel hammer' )")
//            query.addEntity(Product.class);
//            products = query.list();

// Пример HQL запроса
   //         Query query = session.createQuery("FROM Product as p INNER JOIN FETCH p.productcategories as pc");
    //        products = query.list();

// можно внести созданный объект в базу при помощи save() или update(product) и он запихнет в базу
// объект со всеми изменениями.
           /* Product product = new Product();
            product.setCount(1);
            product.setDescription("AAAa");
            session.save(product);*/

//===============================================
//Creteria создается из сессии для работы с классом

            Criteria criteria = session.createCriteria(Product.class);//

//примеры запросов
            //criteria.add(Restrictions.eq("title", "5dd"));//equals(select*from product where product.title = '5dd')
            //criteria.add(Restrictions.eq("description", "we"));//обьединение запросов and desc...=we

            //criteria.add(Restrictions.eq("id", arr)); //where id IN (1,2,3,4)
             criteria.add(Restrictions.like("price", "113"));
            //products = criteria.list(); //так же можно вытащить критерию в лист
      // мульти обьединение      criteria.add(Restrictions.or(Restrictions.not(Restrictions.between("er","er"))));
           criteria.addOrder(Order.desc("id")); //сорт по убыванию

            session.getTransaction().commit();

        }
        catch(Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

        for(Product obj: products){
           System.out.println(obj.toString());
       }

//        for(Iterator iterator = products.iterator();iterator.hasNext();)
//        {
//            Product product = (Product) iterator.next();
//            System.out.println(product);
//        }

    }
}
/*
SELECT * FROM Product p INNER JOIN product_category pc ON p.product_category_id = pc.id
Для одного вызова можно много иннер джоинов
FROM Product as p INNER JOIN p.productCategory as pc
INNER JOIN p.productCategory as pc
INNER JOIN p.productCategory as pc
INNER JOIN p.productCategory as pc
INNER JOIN p.productCategory as pc;

 */
