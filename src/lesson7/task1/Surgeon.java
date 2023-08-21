package lesson7.task1;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Surgeon treat");
    }
}
