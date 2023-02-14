public class Main {

    private static final int Employee_number = 10;

    public static void main(String[] args) {
        final Employee[] employees = new Employee[Employee_number];
        employees[0] = new Employee(" Петров Петр Петрович",1, 130000);
        employees[1] = new Employee(" Филатов Леонид Петрович",5, 190000);
        employees[2] = new Employee(" Григорьев Алексей Дмитриевич",3, 120000);
        employees[3] = new Employee(" Сидоров Константин Алексеевич",2, 90000);
        employees[4] = new Employee(" Северюхин Сергей Семенович",4, 750000);
        employees[5] = new Employee(" Соколов Андрей Алексеевич",1, 180000);
        employees[6] = new Employee(" Александров Константин Семенович",5, 60000);
        employees[7] = new Employee(" Логинов Владимир Андреевич",3, 300000);
        employees[8] = new Employee(" Лялякин Леонид Юрьевич",4, 80000);
        employees[9] = new Employee(" Иванов Дмитрий Степанович",1, 170000);

        printEmployees(employees);
        System.out.println("------------------------------------------------------------------");
        printFullNameEmployees(employees);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Сумма зарплат - " + getSalarySum(employees) + " рублей.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Сотрудник с минемальной зарплатой - " + getMinSalary(employees) );
        System.out.println("------------------------------------------------------------------");
        System.out.println("Сотрудник с максимальной зарплатой - " + getMaxSalary(employees) );
        System.out.println("------------------------------------------------------------------");
        System.out.println("Средняя зарплата - " + getAverageSalary(employees) + " рублей." );
        System.out.println("------------------------------------------------------------------");
    }
    private static void printEmployees(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    private static void printFullNameEmployees(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }

    private static int getSalarySum(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees){
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    private static Employee getMinSalary(Employee[] employees){
        Employee employeeMinSalary = employees[0];

        for (Employee employee : employees){
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    private static Employee getMaxSalary(Employee[] employees){
        Employee employeeMaxSalary = employees[0];

        for (Employee employee : employees){
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    private static double getAverageSalary(Employee[] employees){
        int salarySum = getSalarySum(employees);
        return (double) salarySum/employees.length;
    }

}