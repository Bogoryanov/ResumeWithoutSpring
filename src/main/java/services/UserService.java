package services;

import hero_profile.hero_profile;
import org.hibernate.Session;
import org.hibernate.Transaction;
import HibernateSessionFactory.HibernateSessionFactory;
import java.util.List;

public class UserService {

    public hero_profile findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(hero_profile.class, id);
    }

    public void save(hero_profile user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(hero_profile user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(hero_profile user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }


}
