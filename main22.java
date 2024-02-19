public class main2 {

    public static float perimeter(int n, float prevPerimeter) {
        return (float) (Math.pow(2, n) * Math.sqrt(2 * (1 - Math.sqrt(1 - Math.pow(prevPerimeter / Math.pow(2, n), 2)))));
    }

    public static float computerError(float perimeter) {
        return (float) (Math.abs(perimeter - (float) Math.PI) / Math.PI);
    }

    public static void main(String[] args) {
        int n = 2;
        float prevPerimeter = 2 * (float) Math.sqrt(2);

        System.out.println("n\t\t\t Периметр\t\t\t Погрешность\t\t\t Точное значение");

        for (int i = 2; i <= 60; i++) {
            float currentPerimeter = perimeter(i, prevPerimeter);
            float error = computerError(currentPerimeter);

            System.out.println(i + "\t\t\t " + currentPerimeter + "\t\t\t " + error + "\t\t\t " + Math.PI);

            prevPerimeter = currentPerimeter;
        }

        float pi = prevPerimeter; // вычисление значения числа π
        float error = (float) (Math.abs((float) Math.PI - pi) / Math.PI); // вычисление погрешности

        System.out.println("\nПогрешность вычисления числа pi: " + error);

    }
}

// В данном коде мы используем цикл for для вычисления значений p для n от 3 до 60.
// Затем мы вычисляем значение числа π путем деления последнего значения p на 2.
// Наконец, мы вычисляем погрешность, сравнивая полученное значение π с математической константой Math.PI.
// Относительная погрешность вычисления числа π с использованием данной рекуррентной формулы будет зависеть от точности вычислений и количества итераций.
// В данном случае, поскольку мы используем 60 итераций, ожидается достаточно точный результат.
