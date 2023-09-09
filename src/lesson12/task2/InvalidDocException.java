package lesson12.task2;

import java.io.IOException;

public class InvalidDocException extends IOException {
    public InvalidDocException(String message) {
        super(message);
    }
}
