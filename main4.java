public class Main {

    public static void main(String[] args) {
        int[] pValues = {80, 800, 8000, 80000, 800000, 8000000, 80000000, 800000000};

        for (int p : pValues) {
            double sum = 0.0;// Инициализация переменной sum, которая будет хранить сумму ряда
            double exactSum = p * 0.125; // Вычисление точного значения суммы ряда
            double relativeError = 0.0; // Инициализация переменной relativeError, которая будет хранить относительную погрешность

            for (int i = 1; i <= p; i++) {
                sum += 0.125; //Вычисление суммы ряда
            }

            relativeError = Math.abs((sum - exactSum) / exactSum) * 100; // Вычисление относительной погрешности

            System.out.println("p = " + p); // Вывод значения p
            System.out.println("Сумма = " + sum); // Вывод значения суммы ряда
            System.out.println("Точное значение суммы = " + exactSum); // Вывод точного значения суммы ряда
            System.out.println("Относительная погрешность = " + relativeError + "%"); // Вывод относительной погрешности
            System.out.println();
        }
    }
}
