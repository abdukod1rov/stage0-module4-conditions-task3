package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("Wrong input!");
        } else {
            double taxRate;

            if (salary <= 10000) {
                taxRate = 0.15;
            } else if (salary <= 20000) {
                taxRate = 0.18;
            } else {
                taxRate = 0.20;
            }

            double taxes = salary * taxRate;
            double netSalary = salary - taxes;

            System.out.println("Salary after taxes: " + netSalary);
        }
    }
}