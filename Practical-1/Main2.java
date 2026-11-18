class Employee {
    int employeeID;
    String name;
    double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee E1 = new Employee(15, "Aakash", 50000.00);
        Employee E2 = new Employee(16, "XYZ", 45000.00);
        Employee E3 = new Employee(17, "ABC", 60000.00);

        E1.displayDetails();
        E2.displayDetails();
        E3.displayDetails();
    }
}