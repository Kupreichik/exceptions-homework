/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/
class task2 {
  public static void main(String args[]) {
    String[] arr = {'one', 'two', 'three'};
    System.out.println(sum2d(arr));
  }
    public static int sum2d(String[][]arr){
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
          int val = Integer.parseInt(arr[i][j]);
          sum += val;
        }
      }
      return sum;
    }
  }
/* У меня получилось только это:
1) error: incompatible types: int cannot be converted to String
*/