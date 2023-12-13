public class Main {
    public static void main(String[] args) {
        Room room = new Room.Builder().area(20.0) .wallColor("White") .hasFurniture(false) .build();


        System.out.println("Area: " + room.getArea());
        System.out.println("Wall Color: " + room.getWallColor());
        System.out.println("Has Furniture: " + room.hasFurniture());

    }
}