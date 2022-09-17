//Дан следующий код, исправьте его там, где требуется
public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if( b != 0 ) {
                System.out.println(a / b);
            } else {
                System.out.println("Деление на 0 невозможно!");
            };
            printSum(23, 234);
            int[] abc = {1, 2};
            int i = 3;
            if( abc != null &&
                i < abc.length &&
                i >= 0 ) {
                abc[i] = 9;
            } else {
                if(abc == null) System.out.println("Указатель не может указывать на null!");
                if(i >= abc.length || i < 0) System.out.println("Массив выходит за пределы своего размера!");
            };
        } catch (Exception ex) {//переместила в последний catch
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {//убрала throws FileNotFoundException
        System.out.println(a + b);
    }

}
