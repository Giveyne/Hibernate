import HibernateShop.Order;
import HibernateShop.Product;
import HibernateStudy.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List <Object> orders = null;
        try{
            session.beginTransaction();
            SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM product")
            .addEntity(Product.class);
            orders = sqlQuery.list();
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
//        for(Object [] obj: orders){
//            System.out.println(obj.toString());
//        }
        orders.stream().forEach(a-> System.out.println(a.toString()));
        System.out.println(orders);

    }
}
//Конфиги прописаны на many-to-many (надо откорректировать имена - результат рефакторинга!)
