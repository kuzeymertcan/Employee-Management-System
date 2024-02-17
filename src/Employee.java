public class Employee {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public Employee(String name, int socialSecurityNumber, float wage, int workingHours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    void displayInfo() {
        System.out.println("Employee Info");
        System.out.println("***************************************");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Social Security Number: " + socialSecurityNumber);
        System.out.println("Employee Wage: $" + wage + "/hr");
        System.out.println("Employee Working Hours: " + workingHours + " hrs");
        System.out.print("Employee Salary: $");
        displaySalary();
        System.out.println("***************************************");
    }

    void displaySalary() {
        System.out.println(wage * workingHours);
    }
}