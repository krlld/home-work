package lesson8.task3;

public class Engine implements Cloneable {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Engine copy() {
        return new Engine(horsePower);
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
