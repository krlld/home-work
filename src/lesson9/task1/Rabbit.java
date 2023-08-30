package lesson9.task1;

public class Rabbit implements Animal {
    @Override
    public void voice() {
        System.out.println("Emulate rabbit voice");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat":
                System.out.println("I dont like meat");
                break;
            case "Grass":
                System.out.println("I like grass");
                break;
            default:
                System.out.println("I dont know what is it");
        }
    }
}
