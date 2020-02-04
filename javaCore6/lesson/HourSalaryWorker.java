package mainPackage.javaCore6.lesson;

public class HourSalaryWorker implements Salary {
    private int hourSalary;

    public HourSalaryWorker(int salary){
        this.hourSalary = salary;
    }

    @Override
    public void salary(){
        int salary = hourSalary*8*30;
        System.out.println("Average salary for month = " + salary);
    }

}
