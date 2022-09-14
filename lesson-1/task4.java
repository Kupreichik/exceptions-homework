/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше*/

class task4 {
  public static void main(String args[]) { 
    var first = new int[] {2, 4, 6};
    var second = new int[] {2, 2, 2}; 
    
    var ints = divArrays(first, second);
    System.out.println(ints[0]);
    System.out.println(ints[1]);
    System.out.println(ints[2]);
  } 
  
  public static int[] divArrays(int[] first, int[] second) {
    if (first.length != second.length) {
      throw new RuntimeException("Lengths of arrays are not similar");
    }

    var result = new int[first.length];

    for(int i = 0; i < result.length; i++) {
      if (second[i] == 0) {
        throw new RuntimeException("division by zero is not possible");
      }
      result[i] = first[i] / second[i];
    }

    return result;
  }
}