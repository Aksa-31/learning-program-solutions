class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return employeeId + " | " + name + " | " + position + " | ₹" + salary;
    }
}

public class EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int count = 0;

    static void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee array full.");
        }
    }

    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(101, "Alice", "Manager", 70000));
        addEmployee(new Employee(102, "Bob", "Developer", 55000));
        addEmployee(new Employee(103, "Charlie", "Tester", 40000));

        displayEmployees();

        searchEmployee(102);

        deleteEmployee(101);

        displayEmployees();
    }
}