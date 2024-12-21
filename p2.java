import java.util.Objects;
import java.util.Scanner;

public class p2 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первая строка: ");
        String a = in.nextLine();
        System.out.print("Вторая строка: ");
        String b = in.nextLine();
        a=a.trim();
        b=b.trim();
        //убрал пробелы в начале и в конце строки//
        if (Objects.equals(a, b))
        {
            System.out.print("Строки идентичны");

        }
        else
        {
            System.out.print("Строки неидентичны");
        }
    }
}
// 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

