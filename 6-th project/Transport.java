abstract class Transport {
    final void move() {
        startEngine();
        navigate();
        stopEngine();
    }

    protected abstract void startEngine();
    protected abstract void navigate();
    protected abstract void stopEngine();
}