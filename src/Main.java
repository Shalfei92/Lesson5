import java.util.Scanner;

public class Main {


    public static boolean IsPositiv(int a) {//1
        if (a >= 0) {
            System.out.println("True");
            return true;

        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean IsNeqativ(int a) {//2
        String conclusion = (a<0? "True" : "False");
        System.out.println(conclusion);
        return true;
        }

    public static boolean IsZero(int a) {//3
        if (a == 0)
            System.out.println("True");
        else
            System.out.println("False");
        return true;
    }
    public static boolean Even(int a) {//4
        if (a%2==0)
            System.out.println("True");
        else
            System.out.println("False");
        return true;
    }
    public static boolean NotEven(int a) {//5
        String conclusion2 = (a%2!=0? "True" : "False");
        System.out.println(conclusion2);
        return true;
    }
    public static void Square(int a) {//6
        System.out.println(a*a);

    }
    public static void Cube(int a) {//7
        System.out.println(a*a*a);

    }
    public static void Degree(int a, int b) {//8
        int result = 1;
        for (int i = 0; i < b; i++) {
            result =(result*a);
        }
        System.out.println(result);
    }
    public static void Sum(int a, int b) {//8

        System.out.println(a+b);
    }
        public static void main (String[]args){
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            int number;
            int number2;
//Задание 1
            System.out.println("Задание 1 (Положительное число). "+"Введите число: ");
            number = scanner1.nextInt();
            IsPositiv(number);
//Задание 2
            System.out.println("Задание 2 (Отрицательное число). "+"Введите число: ");
            number = scanner1.nextInt();
            IsNeqativ(number);
//Задание 3

            System.out.println("Задание 3 (Ноль). "+"Введите число: ");
            number = scanner1.nextInt();
            IsZero(number);
//Задание 4
            System.out.println("Задание 4 (Четное число) "+"Введите число: ");
            number = scanner1.nextInt();
            Even(number);
//Задание 5
            System.out.println("Задание 5 (Нечетное число) "+"Введите число: ");
            number = scanner1.nextInt();
            NotEven(number);
//Задание 6
            System.out.println("Задание 6 (Возведение в квадрат) "+"Введите число: ");
            number = scanner1.nextInt();
            Square(number);
//Задание 7
            System.out.println("Задание 7 (Возведение в куб) "+"Введите число: ");
            number = scanner1.nextInt();
            Cube(number);
//Задание 8
            System.out.println("Задание 8 (Возведение в степень)");
            System.out.println("Введите число: ");
            number = scanner1.nextInt();
            System.out.println("Введите степень: ");
            number2 = scanner2.nextInt();
            Degree(number,number2);
//Задание 9
            System.out.println("Задание 9 (Сумма чисел)");
            System.out.println("Введите число1:");
            number = scanner1.nextInt();
            System.out.println("Введите число2:");
            number2 = scanner2.nextInt();
            Sum(number,number2);

        }
    }
