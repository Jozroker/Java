package mainPackage.javaCore1.lesson;
import java.util.Arrays;

public class Java_Core_1_Lesson {
    public static void main(String[] args) {
        boolean value1 = true;
        byte value2 = 14;
        short value3 = 444;
        int value4 = -176;
        long value5 = 4652345;
        float value6 = 3213;
        double value7 = 136234.15312;
        char value8 = '&';
        String value9 = "Text";

        System.out.println("Min Int: "+Integer.MIN_VALUE);
        System.out.println("Max Int: "+Integer.MAX_VALUE);
        System.out.println("True Boolean: "+Boolean.TRUE);
        System.out.println("False Boolean: "+Boolean.FALSE);
        System.out.println("Min Byte: "+Byte.MIN_VALUE);
        System.out.println("Max Byte: "+Byte.MAX_VALUE);
        System.out.println("Min Short: "+Short.MIN_VALUE);
        System.out.println("Max Short: "+Short.MAX_VALUE);
        System.out.println("Min Long: "+Long.MIN_VALUE);
        System.out.println("Max Long: "+Long.MAX_VALUE);
        System.out.println("Min Float: "+Float.MIN_VALUE);
        System.out.println("Max Float: "+Float.MAX_VALUE);
        System.out.println("Min Double: "+Double.MIN_VALUE);
        System.out.println("Max Double: "+Double.MAX_VALUE);
        System.out.println("Min Char: "+Character.MIN_VALUE);
        System.out.println("Max Char: "+Character.MAX_VALUE);

        int [] arr = {15, 753, 34, 563, 34, 86, -43, 34, 0, -125};
        while (value1){
            value1 = false;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    value1 = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min Value Array: "+arr[0]);
        System.out.println("Max Value Array: "+arr[9]);
    }
}
