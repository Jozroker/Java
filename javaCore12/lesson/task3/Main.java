package mainPackage.javaCore12.lesson.task3;

public class Main {
    public static void main(String[] args) {
        try {
            MyArrayList arrList = new MyArrayList("Integer");
            System.out.println(arrList);
            arrList.add(23);
            System.out.println(arrList);
            arrList.add(25);
            arrList.add(18);
            arrList.add(0);
            arrList.add(-4);
            System.out.println(arrList);
            arrList.remove(1);
            arrList.remove(3);
            System.out.println(arrList);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundException");
        }
    }

}
