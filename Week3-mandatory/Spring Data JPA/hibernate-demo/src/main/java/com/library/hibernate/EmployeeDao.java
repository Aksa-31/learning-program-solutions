package com.library.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDao {

    public void addEmployee(Employee emp) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(emp);
            transaction.commit();
            System.out.println("Employee saved with ID: " + emp.getId());
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("ERROR while saving employee: " + e.getMessage());
        }
    }
}
