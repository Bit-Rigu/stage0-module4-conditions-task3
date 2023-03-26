package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10_000 && salary >= 0) System.out.println(0.85 * salary);
        else if (salary <= 20_000 && salary > 10_000) System.out.println(0.82 * salary);
        else if (salary > 20_000) System.out.println(0.8 * salary);
        else System.out.println("wrong input!");
    }
}
