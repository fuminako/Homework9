
public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
            System.out.println(array[i]);
        }

        // Задание 1
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задание 2
        int maxWaste = array[0];
        int minWaste = array[0];
        for (int n : array) {
            if (n > maxWaste) {
                maxWaste = n;
            }
            if (n < minWaste) {
                minWaste = n;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей");

        // Задание 3
        float[] arrayMoney = new float[30];
        float sumMoney = 0;
        float mean = 0;
        for (int num = 0; num < arrayMoney.length; num++) {
            arrayMoney[num] = random.nextInt(100_000) + 100_000;
        }
        for (float num: arrayMoney) {
            sumMoney += num;
            mean = sumMoney/arrayMoney.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName [i]);
        }
    }
}