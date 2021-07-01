package backoffice.repository.concretes;

import backoffice.model.DomainEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;

import java.sql.SQLException;

/**
 * A class that connects to database and give CRUD methods
 */
public class MainRepository {

    private static MainRepository main;
    private Session session;

    public MainRepository(){
        Configuration config = new Configuration();
        SessionFactory sessionFactory = config.configure().buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public static MainRepository getInstance(){
        if(main == null){
            main = new MainRepository();
        }
        return main;
    }

    public boolean save(DomainEntity domainEntity){
        session.beginTransaction();
        try{
            session.save(domainEntity);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            return false;
        }
        return true;
    }

    public boolean update(DomainEntity domainEntity){
        session.beginTransaction();
        try{
            session.update(domainEntity);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            return false;
        }
        return true;
    }

    public boolean delete(DomainEntity domainEntity){
        session.beginTransaction();
        try{
            session.delete(domainEntity);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            return false;
        }
        return true;
    }
}
