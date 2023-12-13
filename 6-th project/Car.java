class Car extends Transport {
    @Override
    protected void startEngine() {
        System.out.println("Запуск двигателя автомобиля");
    }

    @Override
    protected void navigate() {
        System.out.println("Управление автомобилем");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Остановка двигателя автомобиля");
    }
}