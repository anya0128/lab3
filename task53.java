public class task53 {
    public static long calc(int[] a) {
        if (a == null) {
            throw new NullPointerException("Масив null");
        }
        if (a.length == 0) {
            throw new IllegalArgumentException("Порожній масив");
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        return (long) Math.abs(max) * Math.abs(min);
    }
    public static void main(String[] args) {
        int[] arr = {-10, 5, 3, 8, -2, 7};
        System.out.println("Результат: " + calc(arr));
        try {
            calc(new int[0]);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: порожньо");
        }
    }
}