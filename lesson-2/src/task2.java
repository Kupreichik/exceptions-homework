//Дан следующий код, исправьте его там, где требуется
public class task2 {
    public static void main(String[] args) {
        var intArray = new int[] {1, 2, 3, 4, 5};//добавила переменную intArray
        int d = 0;
        int i = -2;
        if( d != 0 &&
            i < intArray.length &&
            i >= 0 ) {
            double catchedRes1 = intArray[i] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            if ( d == 0 ) System.out.println("Проблема: деление на 0 невозможно");
            if ( i < 0 || i >= intArray.length) System.out.println("Проблема: индекс i за пределами массива");
        }
    }
}
