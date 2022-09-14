/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
оповестить пользователя.*/

class task3 {
  public static void main(String args[]) { 
    var first = new int[] {2, 3, 4};
    var second = new int[] {1, 2, 3}; 
    
    var ints = diffArrays(first, second);
    System.out.println(ints[0]);
    System.out.println(ints[1]);
    System.out.println(ints[2]);
  } 
  
  public static int[] diffArrays(int[] first, int[] second) {
    if (first.length != second.length) {
      throw new RuntimeException("Lengths of arrays are not similar");
    }

    var result = new int[first.length];

    for(int i = 0; i < result.length; i++) {
      result[i] = first[i] - second[i];
    }

    return result;
  }
}