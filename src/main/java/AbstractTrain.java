public abstract class AbstractTrain {

    private String name;
    private int speed;

    public AbstractTrain(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}