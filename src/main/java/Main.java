import HibernateStudy.HibernateUtil;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
//Конфиги прописаны на many-to-many (надо откорректировать имена - результат рефакторинга!)
