package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate1.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
//        Session session = factory.openSession();
        Employee emp = new Employee();
        emp.setEmpName("Dhoni");
        emp.setDeign("Captain");

        Bank bank = new Bank();
        bank.setBid(121);
        bank.setbName("RBL");
        emp.setBank(bank);


        Employee emp1 = new Employee();
        emp1.setEmpName("Cohli");
        emp1.setDeign("Selfish Player");

        Bank bank1 = new Bank();
        bank1.setBid(120);
        bank1.setbName("WorldBank");
        emp1.setBank(bank1);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        session.save(emp1);
        tx.commit();
        session.close();
        factory.close();

    }
}
