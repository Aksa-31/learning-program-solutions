package com.library.hibernate;

public class Main {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        Employee emp = new Employee();
        emp.setName("Aksa");
        emp.setSalary(50000);

        dao.addEmployee(emp);
    }
}
