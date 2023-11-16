package ex1;

import java.util.List;

public class AverageSalaryCalculator extends Thread{

    private List<Employee> employees;
    private float averageSalary;

    public AverageSalaryCalculator (List<Employee> employees){
        this.employees = employees;
        this.averageSalary = Integer.MIN_VALUE;
    }

    public float getAverageSalary() {
        return averageSalary;
    }

    @Override
    public void run(){
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        this.averageSalary = (float) sum / employees.size();
    }
}
