package backoffice.repository.concretes;

import backoffice.model.Test;
import backoffice.repository.abstracts.ITestRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository("testRepository")
public class TestRepository implements ITestRepository {

    public String saveTestRecipient(Test test) {
        Configuration config = new Configuration();
        SessionFactory sessionFactory = config.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        session.save(test);
        t.commit();
        // insere na DB
        return test.getText();
    }
}
