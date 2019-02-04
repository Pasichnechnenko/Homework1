package HW;

public class HW1 {

    public static void main(String[] args)
    {

        System.out.println("Formula=" + Chet(8, 6, 7));
        System.out.println("Factorial=" + calculateFactorial(9));
        Square(3.8);
        Rectangle(2,4);
        Circle(4 );
        Triangle(2,4,5,4);
        Ticket(5);
        System.out.println("Mirror=" + Reverse(123));
    }

    /* 1) Если а – четное посчитать а*б/с, если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
    иначе посчитать а+b-с. */

    public static int Chet(int a, int b, int c) {
        int result = 0;
        if (a % 2 == 0) {
            result = a * b / c;
        } else if (a + c == 0 || b + c == 0) {
            result = a ^ c;
        } else {
            result = a + b - c;
        }
        return result;
    }

    /* 2) Рассчитать и вывести в консоль площадь и периметр фигур: квадрат, прямоугольник, круг, треугольник
     */

    public static void Square(double q) {
        System.out.println("SquareArea = " + Math.pow(q, 2));
        System.out.println("SquarePerimetr = " + (4 * q));
    }

    public static void Rectangle(double width, double length) {
        System.out.println("RectangleArea = " + (width * length));
        System.out.println("RectanglePerimetr = " + (2 * (width + length)));
    }

    public static void Circle(double radius) {
        System.out.println("CircleArea = " + ((Math.pow(radius, 2)) * Math.PI));
        System.out.println("CirclePerimetr = " + ((2 * Math.PI) * radius));
    }

    public static void Triangle(double lowside, double side1, double side2, double height) {
        System.out.println("TriangleArea = " + (0.5 * lowside * height));
        System.out.println("TrianglePerimetr = " + (lowside + side1 + side2));
    }

    /* 3) Вывести сумму возврата от билета стоимостью 1000 грн:
    Билет вернули за 10 до отправления - полная стоимость
    От 10 до 5 включительно - 80%
    От 5 до 1 дня - 60%
    В день отправления - 20%. */

    public static double Ticket(int day) {
        double m = 1000.0;
        double refund = 0;
        if (day >= 10) {
            System.out.println(m);
        } else if (day < 10 && day >= 5) {
            System.out.println(m * 0.8);
        } else if (day < 5 && day >= 1) {
            System.out.println(m * 0.6);
        } else {
            System.out.println(m * 0.2);
        }
        return refund;
        }


    /* 4) Вычислить факториал числа n. n! = 1*2*…*n-1*n; */

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /* 5) Вывести число, которое является зеркальным отображением последовательности цифр заданного числа,
    например, задано число 123, вывести 321 */

    public static int Reverse(int ch) {
        {
            int task5Result = 0;
            while (ch != 0) {
                task5Result = task5Result * 10 + ch % 10;
                ch /= 10;
            }
            task5Result = Math.abs(task5Result);
            return task5Result;
        }
    }
}