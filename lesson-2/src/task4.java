import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит
// пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя
public class task4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter string:");
        String enter = scaner.nextLine();
        if( enter.isEmpty() ) {
            throw new RuntimeException("you can't enter an empty string");
        }
    }
}
