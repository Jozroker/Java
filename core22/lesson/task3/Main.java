package mainPackage.core22.lesson.task3;

public class Main {

    public static void main(String[] args) {
        ValueGetter getter = clas -> {
            if (clas.getSimpleName().equals("Float")) {
                System.out.println("\nMax value: " + Float.MAX_VALUE + "\nMin value: " + Float.MIN_VALUE);
            } else if (clas.getSimpleName().equals("Double")) {
                System.out.println("\nMax value: " + Double.MAX_VALUE + "\nMin value: " + Double.MIN_VALUE);
            } else {
                System.out.println("Undefined class");
            }
        };
        getter.clas(Float.class);
        getter.clas(Double.class);

    }

    private interface ValueGetter {
        void clas(Class clas);
    }
}
