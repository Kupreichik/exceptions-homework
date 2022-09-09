/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/

  public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < 5; j++) {
        int val = Integer.parseInt(arr[i][j]);
        sum += val;
      }
    }
    return sum;
  }
/* У меня получилось только это:
1) error: incompatible types: int cannot be converted to String
2) error: class, interface, or enum expected */