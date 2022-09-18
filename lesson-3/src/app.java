import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String[] userData = new String[6];
        System.out.println("Введите фамилию имя отчество:");
        for(int i = 0; i < 3; i++) {
            userData[i] = scaner.next();
        }
        System.out.println("Введите дату рождения дд.мм.гггг:");
        userData[3] = scaner.next();
        System.out.println("Введите номер телефона в формате 79992223535:");
        userData[4] = scaner.next();
        System.out.println("Введите пол f или m:");
        userData[5] = scaner.next();

        int checkResult = checkArr(userData);//добавила требуемую в задании проверку на количество введенных данных, но метод scaner.next() не допускает подобных случаев.
        if(checkResult == -1) {
            System.out.println("Ошибка: введены пустые строки");
        };
        if(checkResult < 6) {
            System.out.println("Ошибка: не все требуемые данные введены");
        };
        if(checkResult > 6) {
            System.out.println("Ошибка: введено больше данных, чем требуется");
        };

        try(FileWriter reader = new FileWriter(userData[0]+".txt", true)) {

            if(isParseFIO(userData) &&
               isParseDate(userData[3]) &&
               isParsePhone(userData[4]) &&
               isParseSex(userData[5]))
            {
                String userDataStr = convertArrToString(userData);
                reader.write(userDataStr+"\n");
                reader.flush();
                System.out.println("Данные сохранены успешно.");
            }

        } catch(UserDataFormatException | IOException ex) {
            System.err.println(ex.getMessage());
            System.err.println(ex.getStackTrace());
        }
    }

    public static int checkArr(String[] arr) {
        int result = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].isBlank()) {
                result = -1;
            };
        }
        return result;
    }

    public static boolean isParseFIO(String[] arr) {
        if(arr[0].matches("[A-Za-zА-ЯЁа-яё]+") &&
           arr[1].matches("[A-Za-zА-ЯЁа-яё]+") &&
           arr[2].matches("[A-Za-zА-ЯЁа-яё]+")) {
            return true;
        } else {
            throw new UserDataFormatException("Фамилия Имя Отчество");
        }
    }

    public static boolean isParseDate(String str) {
        if(str.matches("(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((?:19|20)[0-9][0-9])")) {
            return true;
        } else {
            throw new UserDataFormatException("Дата рождения");
        }
    }

    public static boolean isParsePhone(String str) {
        if(str.matches("^[78]\\d{10}$")) {
            return true;
        } else {
            throw new UserDataFormatException("Номер телефона");
        }
    }

    public static boolean isParseSex(String str) {
        if(str.matches("[F|f]|[M|m]")) {
            return true;
        } else {
            throw new UserDataFormatException("Пол");
        }
    }

    public static String convertArrToString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String str : arr)
            sb.append(str).append(" ");
        return sb.substring(0, sb.length() - 1);
    }

    public static class UserDataFormatException extends RuntimeException {
        UserDataFormatException(String data) {
            super("Данные '"+data+"' введены некорректно");
        }
    }
}
