public class Main {
    public static void main(String[] args) {

        Transport car = new Car();
        Transport bicycle = new Bicycle();
        Transport train = new Train();

        car.move();
        System.out.println();
        bicycle.move();
        System.out.println();
        train.move();

    }
}