package lesson17.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  Задача *:
//  Программа на вход получает произвольный текст. В этом тексте может быть номер
//  документа(один или несколько), емейл и номер телефона. Номер документа в формате:
//  xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
//  может содержать не всю информацию, т.е. например, может не содержать номер
//  телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
//  формате:
//  email: teachmeskills@gmail.com
//  document number: 1423-1512-51
//  и т.д
public class Main {
    private static final Pattern documentNumber = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
    private static final Pattern email = Pattern.compile("\\b[A-Za-z0-9.-]+@[a-z]+\\.[a-z]{2,3}\\b");
    private static final Pattern telephoneNumber = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}");

    public static void main(String[] args) {
        String input = "document number: 1423-1512-51 document number: 1423-1512-52 email: teachmeskills@gmail.com telephone: +(78)8675878";
        findDocumentNumbers(input).forEach(x -> System.out.println("Document number: " + x));
        System.out.println("Email: " + findEmail(input));
        System.out.println("Telephone number: " + findTelephoneNumber(input));
    }

    public static List<String> findDocumentNumbers(String str) {
        Matcher matcher = documentNumber.matcher(str);
        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }

    public static String findEmail(String str) {
        Matcher matcher = email.matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    public static String findTelephoneNumber(String str) {
        Matcher matcher = telephoneNumber.matcher(str);
        return matcher.find() ? matcher.group() : "";
    }
}
