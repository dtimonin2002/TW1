import java.util.Scanner;

public class p1 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = in.nextInt();
        System.out.print("Второе число: ");
        int b = in.nextInt();
        if (a>b)
        {
            System.out.print("a>b");
        }
        if (a<b)
        {
            System.out.print("a<b");
        }
        if (a==b)
        {
            System.out.print("a=b");
        }
    }
}



//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
