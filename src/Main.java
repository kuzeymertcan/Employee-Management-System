class Main {
    public static void main(String[] args) {
        String name = "Fatih";
        int socialSecurityNumber = 124578;
        float wage = 15.5f;
        int workingHours = 42;

        Employee employee1 = new Employee(name, socialSecurityNumber, wage, workingHours);

        employee1.displayInfo();
    }
}