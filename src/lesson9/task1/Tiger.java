package lesson9.task1;

public class Tiger implements Animal {
    @Override
    public void voice() {
        System.out.println("Emulate tiger voice");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat":
                System.out.println("I like meat");
                break;
            case "Grass":
                System.out.println("I dont like grass");
                break;
            default:
                System.out.println("I dont know what is it");
        }
    }
}
