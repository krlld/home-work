package lesson11.task1;

public class AccountChecker {
    public static boolean isCorrectData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isStringLengthMore(login, 19)) {
            throw new WrongLoginException("Login length > 19");
        }
        if (isContainWhitespace(login)) {
            throw new WrongLoginException("Login contain whitespace");
        }

        if (isStringLengthMore(password, 19)) {
            throw new WrongPasswordException("Password length > 19");
        }
        if (isContainWhitespace(password)) {
            throw new WrongPasswordException("Password contain whitespace");
        }
        if (!isContainDigit(password)) {
            throw new WrongPasswordException("Password isn't contain digit");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password isn't equals");
        }

        return true;
    }

    private static boolean isStringLengthMore(String str, int length) {
        return str.length() > length;
    }

    private static boolean isContainWhitespace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
