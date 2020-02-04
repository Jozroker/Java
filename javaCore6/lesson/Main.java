package mainPackage.javaCore6.lesson;

public class Main {
    public static void main(String[] args) {
        Salary worker1 = new HourSalaryWorker(150);
        Salary worker2 = new MonthSalaryWorker(14200);

        worker1.salary();
        worker2.salary();
    }
}
