package ex1;

import java.util.List;

public class MaxSalaryCalculator extends Thread{

    private List<Employee> employees;
    private int maxSalary;

    public MaxSalaryCalculator (List<Employee> employees){
        this.employees = employees;
        this.maxSalary = Integer.MIN_VALUE;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    @Override
    public void run(){
        int max = 0;
        for (Employee employee : employees){
            if (employee.getSalary() > max){
                max = employee.getSalary();
            }
        }
        maxSalary = max;
    }
}
