package mainPackage.javaCore6.lesson;

public class MonthSalaryWorker implements Salary{
    private int monthSalary;

    public MonthSalaryWorker(int salary){
        this.monthSalary = salary;
    }

    @Override
    public void salary(){
        System.out.println("Month salary = " + monthSalary);
    }
}
