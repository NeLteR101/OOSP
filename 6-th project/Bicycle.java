class Bicycle extends Transport {
    @Override
    protected void startEngine() {
        System.out.println("Начало педалирования велосипеда");
    }

    @Override
    protected void navigate() {
        System.out.println("Управление велосипедом");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Остановка педалирования велосипеда");
    }
}
