public class Main {

    public static void main(String[] args) {
        int n = 10; // Задайте значение n

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sum4 = 0;

        // Суммирование по-порядку слева направо
        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / i;
        }

        // Суммирование слева направо с вычитанием
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum2 -= 1.0 / i;
            } else {
                sum2 += 1.0 / i;
            }
        }

        // Суммирование по-порядку справа налево
        for (int i = n; i >= 1; i--) {
            sum3 += 1.0 / i;
        }

        // Суммирование справа налево с вычитанием
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                sum4 -= 1.0 / i;
            } else {
                sum4 += 1.0 / i;
            }
        }

        System.out.println("Сумма (слева направо): " + sum1);
        System.out.println("Сумма (слева направо с вычитанием): " + sum2);
        System.out.println("Сумма (справа налево): " + sum3);
        System.out.println("Сумма (справа налево с вычитанием): " + sum4);
    }
}
