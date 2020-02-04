package mainPackage.javaCore9.lesson.task_2;

public class Methods {

    private static IllegalArgumentException argException = new IllegalArgumentException();
    private static ArithmeticException arithmException = new ArithmeticException();
    private static MyException exception = new MyException();



    private static void Check(int a, int b) throws MyException{
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw argException;
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw arithmException;
        } else if (a > 0 && b > 0) {
            throw exception;
        }

    }


    public static void add(int a, int b){
        try{
            Check(a,b);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            return;
        } catch (MyException e) {
            System.out.println("MyException");
            return;
        }
        System.out.println(a + b);

    }

    public static void subtraction(int a, int b){
        try {
            Check(a,b);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            return;
        } catch (MyException e) {
            System.out.println("MyException");
            return;
        }
        System.out.println(a - b);
    }

    public static void multiply(int a, int b){
        try{
            Check(a,b);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            return;
        } catch (MyException e) {
            System.out.println("MyException");
            return;
        }
        System.out.println(a * b);
    }

    public static void devide(int a, int b){
        try{
            Check(a,b);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
            return;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            return;
        } catch (MyException e) {
            System.out.println("MyException");
            return;
        }
        System.out.println(a / (double) b);
    }
}
