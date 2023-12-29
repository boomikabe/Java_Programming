
package javaapplication3;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public double calculateSalary() {
        return 50000; 
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String name, int employeeId, double bonusPercentage) {
        super(name, employeeId);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        double basicSalary = super.calculateSalary();
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 10000; 
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

public class Employeeimple {
    public static void main(String[] args) {
        // Creating instances of Manager and Developer
        Manager manager = new Manager("John Doe", 101, 15.0);
        Developer developer = new Developer("Jane Smith", 102, "Java");

        System.out.println("Manager: " + manager.getName() + " (ID: " + manager.getEmployeeId() +
                ") Salary: $" + manager.calculateSalary() + " (Bonus: " + manager.getBonusPercentage() + "%)");

        System.out.println("Developer: " + developer.getName() + " (ID: " + developer.getEmployeeId() +
                ") Salary: $" + developer.calculateSalary() + " (Language: " + developer.getProgrammingLanguage() + ")");
    }
}