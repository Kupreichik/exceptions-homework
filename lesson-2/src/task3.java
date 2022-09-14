//Дан следующий код, исправьте его там, где требуется
public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {//добавила ArithmeticException
            System.out.println("Деление на 0 невозможно!");
        } catch (Throwable ex) {//переместила в последний catch
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {//убрала throws FileNotFoundException
        System.out.println(a + b);
    }

}
