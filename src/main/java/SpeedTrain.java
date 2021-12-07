public class SpeedTrain extends AbstractTrain implements Comfortable, Common {

    private String categoryOfWagon;
    private int maxQuantityOfSeats;
    private int costOfTicket;

    private static final int QUANTITY_OF_PASSENGERS_COMFORT = 80;
    private static final int QUANTITY_OF_PASSENGERS_COMMON = 100;

    static int count = 0;

    public SpeedTrain(String name, int speed, String categoryOfWagon, int maxQuantityOfSeats, int costOfTicket) {
        super(name, speed);
        this.categoryOfWagon = categoryOfWagon;
        this.maxQuantityOfSeats = maxQuantityOfSeats;
        this.costOfTicket = costOfTicket;
    }

    public String getCategoryOfWagon() {
        return categoryOfWagon;
    }

    public int getMaxQuantityOfSeats() {
        return maxQuantityOfSeats;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    @Override
    public int checkQuantityOfSeatsComfortableWagon(int a) {
        if (a <= QUANTITY_OF_PASSENGERS_COMFORT) {
            System.out.println("Cashier: There are free seats in a comfortable carriage");
            return a;
        } else {
            System.out.println("Cashier: The comfortable carriage is full, there are no seats");
            return 0;
        }
    }

    @Override
    public int checkQuantityOfSeatsCommonWagon(int a) {
        if (a <= QUANTITY_OF_PASSENGERS_COMMON) {
            System.out.println("Cashier: There are free seats in the common carriage");
            return a;
        } else {
            System.out.println("Cashier: The common carriage is full, there are no seats");
            return 0;
        }
    }

    public int checkComfortableWagonPay(int a) {
        if (a >= 100) {
            System.out.println("Cashier: You have paid the fare, you can go in a comfortable carriage");
        } else {
            System.out.println("Cashier: You didn't pay enough for a ride in a comfortable carriage");
        }
        return a;
    }

    public int checkCommonWagonPay(int a) {
        if (a >= 50) {
            System.out.println("Cashier: You have paid your fare, you can ride in a common carriage");
        } else {
            System.out.println("Cashier: You didn't pay enough for a ride in a common carriage");
        }
        return a;
    }

    @Override
    public String toString() {
        return String.format("General information: name of train: %s, speed: %d, wagon type: %s, count of seats: %d, cost of ticket: %d",
                getName(), getSpeed(), getCategoryOfWagon(), getMaxQuantityOfSeats(), getCostOfTicket());
    }
}