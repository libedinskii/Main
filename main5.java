public class Main {

    public static void main(String[] args) {
        float[] pValues = {100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        for (float p : pValues) {
            float sum = 0.0f; // Инициализация переменной sum, которая будет хранить сумму ряда
            float exactSum = p * 0.1f; // Вычисление точного значения суммы ряда
            float relativeError = 0.0f; // Инициализация переменной relativeError, которая будет хранить относительную погрешность

            for (int i = 1; i <= p; i++) {
                sum += 0.1f; //Вычисление суммы ряда
            }

            relativeError = Math.abs(sum - exactSum) / exactSum; // Вычисление относительной погрешности

            System.out.println("p = " + p); // Вывод значения p
            System.out.println("Сумма = " + sum); // Вывод значения суммы ряда
            System.out.println("Точное значение суммы = " + exactSum); // Вывод точного значения суммы ряда
            System.out.println("Относительная погрешность = " + relativeError); // Вывод относительной погрешности
            System.out.println();
        }
    }
}
