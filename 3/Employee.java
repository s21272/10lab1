import java.time.LocalDateTime;

public class Employee extends Person {
    int hireDate, salary;
    String companyName;

    public Employee(String firstName, String lastName, int birthYear, int hireDate, String companyName, int salary) {
        super(firstName, lastName, birthYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        int jobSeniority = 2020 - hireDate;
        return jobSeniority;
    }

    public int getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }
}
