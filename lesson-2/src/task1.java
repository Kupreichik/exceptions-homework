/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(returnFloat());
    }

    public static float returnFloat() {
        Scanner scaner = new Scanner(System.in);
        String enter = scaner.nextLine();
        while(!enter.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("Введены некорректные данные, повторите попытку:");
            enter = scaner.nextLine();
        }
        return Float.parseFloat(enter);
    }
}
