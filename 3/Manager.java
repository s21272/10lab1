public class Manager extends Employee {
    int bonus;

    public Manager(String firstName, String lastName, int birthYear, int hireDate, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return " Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
    }
}
