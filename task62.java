import java.util.Arrays;
public class task62 {
    public static double[] transform(int[] a) {
        if (a == null) {
            throw new NullPointerException("Масив null");
        }
        if (a.length == 0) {
            throw new IllegalArgumentException("Порожній масив");
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        double[] res = new double[a.length];
        if (min != 0) {
            for (int i = 0; i < a.length; i++) {
                res[i] = (double) a[i] / min;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                res[i] = 10.0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a1 = {4, 2, 8, 6};
        int[] a2 = {5, 0, 10};

        System.out.println("Тест 1: " + Arrays.toString(transform(a1)));
        System.out.println("Тест 2: " + Arrays.toString(transform(a2)));
    }
}