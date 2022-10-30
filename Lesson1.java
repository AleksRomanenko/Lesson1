package ru.geekbrains;

public class Lesson1 {
    public static void main(String[] args) {
            data();
            System.out.println("a * (b + (c / d)) = " + calculate(2, 2, 2, 2));
            System.out.println(task10and20(10, 9));
            isPositiveOrNegative(-15);
            System.out.println(isNegative(-10));
            greetings("Александр");
            Сalendar(2001);
        }

        //2 Создать переменные всех пройденных типов данных, и инициализировать их значения;
        static void data() {
            System.out.println("Задание #2.");
            byte bt = 1;
            short s = 123;
            int i = 12345;
            long l = 12345L;
            float f = 12.34f;
            double d = 12.34;
            char c = 'a';
            boolean b = false;

            System.out.println("Значение для типа byte = " + bt);
            System.out.println("Значение для типа short = " + s);
            System.out.println("Значение для типа int = " + i);
            System.out.println("Значение для типа long = " + l);
            System.out.println("Значение для типа float = " + f);
            System.out.println("Значение для типа double = " + d);
            System.out.println("Значение для типа char = [" + c + "]");
            System.out.println("Значение для типа boolean = " + b);
        }

        /*
        3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – входные параметры этого метода;
        */
        static float calculate(float a, float b, float c, float d) {
            System.out.println("\nЗадание #3.");
            float res = a * (b + (c / d));
            return res;
        }

        /*
        4 Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит
        в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        */
        static boolean task10and20(int a, int b) {
            System.out.println("\nЗадание #4.");
            int sum = a + b;
            if (sum >= 10 && sum <= 20) return true;
            else return false;
        }

        /*
         5 Написать метод, которому в качестве параметра передается целое число, метод должен
         напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
         считаем положительным числом.
        */
        static void isPositiveOrNegative(int a) {
            System.out.println("\nЗадание #5.");
            if (a >= 0) {
                System.out.println("Число " + a + "положительное");
            } else {
                System.out.println("Число " + a + " отрицательное");
            }
        }

        /*
        6 Написать метод, которому в качестве параметра передается целое число, метод должен
        вернуть true, если число отрицательное и вернуть false если число положительное
        */
        static boolean isNegative(int a) {
            System.out.println("\nЗадание #6.");
            if (a < 0) return true;
            return false;
        }

        /*
         7 Написать метод, которому в качестве параметра передается строка, обозначающая имя,
         метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        */
        static void greetings(String name) {
            System.out.println("\nЗадание #7.");
            System.out.println("Привет, " + name + "!");
        }

        /*
        Написать метод, который определяет является ли год високосным, и выводит сообщение
        в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й - високосный.
        */
        static void Сalendar(int year) {
            System.out.println("\nЗадание #8.");
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " г. високосный");
            }
            else {
                System.out.println(year + " г. невисокосный");
            }
        }
    }


