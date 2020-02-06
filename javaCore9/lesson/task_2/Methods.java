package mainPackage.javaCore9.lesson.task_2;

public class Methods {

    private static void Check(int a, int b) throws MyException {
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw new IllegalArgumentException("IllegalArgumentException. Values are less then 0 or equals to 0");
        } else if (a == 0 || b == 0) {
            throw new ArithmeticException("ArithmeticException. One of values are equals to 0");
        } else if (a > 0 && b > 0) {
            throw new MyException("MyException. Values more then 0");
        }

    }


    public static void add(int a, int b) throws MyException {
        Check(a, b);
        System.out.println(a + b);
    }

    public static void subtraction(int a, int b) throws MyException {
        Check(a, b);
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) throws MyException {
        Check(a, b);
        System.out.println(a * b);
    }

    public static void devide(int a, int b) throws MyException {
        Check(a, b);
        System.out.println(a / (double) b);
    }
}

