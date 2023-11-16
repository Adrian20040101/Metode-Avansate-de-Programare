package ex1;

import java.util.List;

public class Calculator {
    public static void employeeStatistics(List<Employee> employees) throws InterruptedException {

        Thread maxSalaryCalculator = new MaxSalaryCalculator(employees);
        Thread averageSalaryCalculator = new AverageSalaryCalculator(employees);

        maxSalaryCalculator.start();
        averageSalaryCalculator.start();

        maxSalaryCalculator.join();

        System.out.println(((MaxSalaryCalculator) maxSalaryCalculator).getMaxSalary());
        System.out.println(((AverageSalaryCalculator) averageSalaryCalculator).getAverageSalary());
    }
}
