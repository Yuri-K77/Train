/* Сделать 2 интерфейса и на их основе реализовать абстрактный класс, и далее создать класс который будет расширять абстрактный класс.
В каком нибудь классе создать объект этого класса и дернуть пару методов. Плюс наш конечный класс должен содержать какие нибудь статические поля,
которые мы используем в методах. Внутри класса создать приватный метод, результат выполнения которого можно получить либо по геттер методу или
просто его использовать внутри какого то иного public метода. */

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