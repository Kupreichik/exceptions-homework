//Дан следующий код, исправьте его там, где требуется
public class task2 {
    public static void main(String[] args) {
        var intArray = new int[] {1, 2, 3, 4, 5};//добавила переменную intArray
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {//добавила ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }
    }
}
