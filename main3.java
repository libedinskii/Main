public class Main3 {

    public static void main(String[] args) {
        double[] pValues = {100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        for (double p : pValues) {
            double sum = 0.0;// Инициализация переменной sum, которая будет хранить сумму ряда
            double exactSum = p * 0.1; // Вычисление точного значения суммы ряда
            double relativeError = 0.0; // Инициализация переменной relativeError, которая будет хранить относительную погрешность

            for (int i = 1; i <= p; i++) {
                sum += 0.1; //Вычисление суммы ряда
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

Этот код вычисляет сумму ряда для каждого значения p из массива pValues. Затем он вычисляет точное значение суммы (p * 0.1) и определяет относительную погрешность результата, используя формулу: |(sum - exactSum) / exactSum| * 100.
