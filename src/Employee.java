import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private long salary;
    private int idNumber;
    private static int counter;

    public Employee(String fullName, int department, long salary){
        this.idNumber = ++counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && idNumber == employee.idNumber && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, idNumber);
    }

    @Override
    public String toString() {
        return "ФИО:" + fullName + " Отдел:" + department + " Зарплата:" + salary + " id-номер " + idNumber;
    }
}




