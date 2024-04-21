import java.util.Scanner;

public class Homework2 {
    public static void main (String[] args) {
        int month;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        month = in.nextInt();
        if (month > 2 && month < 6) {
            System.out.println("Весна");
        } else if (month > 5 && month < 9) {
            System.out.println("Лето");
        } else if (month > 8 && month < 12) {
            System.out.println("Осень");
        } else if (month == 12 || month <= 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Введите корректное число");
        }


        //задание 2

        System.out.println("Задание Medium");
        int varIf3 = 4560;
        System.out.println(varIf3 % 10 == 3 ? "Последняя цифра числа - 3" : "Последняя цифра не 3");

        //задание 3

        System.out.println("Задание Hard");
        int amountOfMoney = 43;
        if (amountOfMoney % 10 == 1) {
            System.out.println(amountOfMoney + " рубль");
        }else if (amountOfMoney % 10 == 2 || amountOfMoney % 10 == 3 || amountOfMoney % 10 == 4) {
            System.out.println(amountOfMoney + " рубля");
        }else if (amountOfMoney % 10 >= 5 || amountOfMoney % 10 == 0) {
            System.out.println(amountOfMoney + " рублей");
        }
    }
}
