public class Main {
    public static void main(String[] args) {

        SpeedTrain comfortableWagon = new SpeedTrain("Minsk-Warsaw", 120,"Comfortable", 80, 100);
        System.out.println(comfortableWagon.toString());
        comfortableWagon.checkQuantityOfSeatsComfortableWagon(80);
        comfortableWagon.checkComfortableWagonPay(100);
        SpeedTrain.count++;

        SpeedTrain commonWagon = new SpeedTrain("Minsk-Warsaw",120,"Common", 100, 50);
        System.out.println("\n" + commonWagon.toString());
        commonWagon.checkQuantityOfSeatsCommonWagon(100);
        commonWagon.checkCommonWagonPay(55);
        SpeedTrain.count++;

        System.out.println("\n" + "Общее количество вагонов : " + SpeedTrain.count);
    }
}