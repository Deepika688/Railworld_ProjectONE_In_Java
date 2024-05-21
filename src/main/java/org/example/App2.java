package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate2.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        User u = new User();
        u.setUid(121);
        u.setuName("Deepika");

        Bank b = new Bank();
        b.setBid(1234);
        b.setbName("RBL");
        u.setBank(b);


        User u1 = new User();
        u1.setUid(122);
        u1.setuName("Khushboo");

        Bank b1 = new Bank();
        b1.setBid(123432);
        b1.setbName("SBI");

        u1.setBank(b1);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(u);
        session.save(u1);
//        session.save(b);
//        session.save(b1);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Data Saved");
    }
}
