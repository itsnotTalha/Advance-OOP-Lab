public abstract class Employee {
    private String name;
    private int id;
    abstract double calculatePay();

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void display(){
        System.out.println("ID: " + getId() + " , Name: " + getName());
    }

}
class SalariedEmployeee extends Employee{
    private double monthlySalary;

    public SalariedEmployeee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return this.monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

class HourlyEmployeee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployeee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        if(hoursWorked <= 40){
            return hourlyRate*hoursWorked;
        } else
//            if (hoursWorked > 40) {
            return (40 * hourlyRate)+((hoursWorked - 40) * hourlyRate * 1.5);
//        }itsTalhaaaa
//        return 0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}

class Mainn {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployeee("Rahim", 101, 50000);
        employees[1] = new HourlyEmployeee("Karim", 102, 500, 45);
        //employees[2] = new HourlyEmployeee("Talha", 110, 5000000, 450);

        for (Employee e : employees) {
            e.display();
            System.out.println("Calculated Pay: " + e.calculatePay());
            System.out.println("-------------------");
        }
    }
}


