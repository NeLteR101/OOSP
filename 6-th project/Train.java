class Train extends Transport {
    @Override
    protected void startEngine() {
        System.out.println("Запуск двигателя поезда");
    }

    @Override
    protected void navigate() {
        System.out.println("Управление поездом");
    }

    @Override
    protected void stopEngine() {
        System.out.println("Остановка двигателя поезда");
    }
}