package mainPackage.core17.lesson;

public class Collection {

    private interface Anonymous {}

    private Number[] numbers;
    private static Number[] numbers2;

    public Collection(Number... numbers) {
        this.numbers = numbers;
        setNumbers2(numbers);
    }

    class NormalIterator implements Iterator{

        private int position = 0;

        @Override
        public boolean hasNext() {
            return numbers.length > position;
        }

        @Override
        public Object next() {
            if (position % 2 != 0) {
                numbers[position] = 0;
            }
            return numbers[position++];
        }
    }

    class ReverseIterator implements Iterator {

        private int position = numbers.length;
        private int parity = position % 2;

        @Override
        public boolean hasNext() {
            return position > 0;
        }

        @Override
        public Object next() {
            if (parity == 0) {
                return position-- % 2 == 0 ? numbers[position] : null;
            } else {
                return position-- % 2 != 0 ? numbers[position] : null;
            }
        }
    }

    class LocalClass {

        private Number[] numbers;
        private int order = 1;

        public LocalClass(Number... numbers) {
            this.numbers = numbers;
        }

        public void getElements() {
            for (Number num : numbers) {
                if (order == 5) {
                    System.out.println((int) num % 2 == 0 ? (int) num - 100 + " " : "");
                    order = 0;
                }
                order++;
            }
        }
    }

    static class Nested {
         private int order = 1;

         public void getNestedClass() {
             for (Number num : numbers2) {
                 if (order == 2) {
                     System.out.print((int) num % 2 == 0 ? (int) num + 1 + " " : "");
                     order = 0;
                 }
                 order++;
             }
             System.out.println();
         }
    }

    public static void setNumbers2(Number[] numbers2) {
        Collection.numbers2 = numbers2;
    }

    public Number[] getNumbers() {
        return numbers;
    }

    public void getNumbersWithNormalIterator(){
        Iterator iteratorNormal = new NormalIterator();
        while (iteratorNormal.hasNext()) {
            System.out.print(iteratorNormal.next() + " ");
        }
        System.out.println();
    }

    public void getNumbersWithReverseIterator(){
        Iterator iteratorReverse = new ReverseIterator();
        while (iteratorReverse.hasNext()) {
            Object currentNumber = iteratorReverse.next();
            if (currentNumber == null) {
                continue;
            } else {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.println();
    }

    public void getAnonymousClass() {
        new Anonymous() {

            private int order = 1;
            private int count = 0;

            public void getNumbers() {
                for (int i = numbers.length - 1; i > 0; i--) {
                    if (order == 3) {
                        if ((int) numbers[i] % 2 != 0) {
                            System.out.println(numbers[i] + " ");
                            count++;
                        }
                        order = 0;
                    }
                    order++;
                }
                if (count == 0) {
                    System.out.println("Not exist this elements...");
                }
                System.out.println();
            }


        }.getNumbers();
    }

    public void getLocalClass() {
        LocalClass local = new LocalClass(numbers);
        local.getElements();
        System.out.println();
    }
}
