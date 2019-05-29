public class SumNumber {
    static final int DIVIDER = 10;

    static int numberSummary(int number) {

        String s = Integer.toString(number);
        System.out.println(s);
        int[] array = new int[s.length()];
        for (int i = 0; i < array.length; i++) {
            int next = number % DIVIDER;
            number /= 10;
            array[i] = next;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}

