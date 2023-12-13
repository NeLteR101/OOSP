abstract class Encryption {
    protected EncryptionAlgorithm algorithm;

    public Encryption(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public abstract void encrypt(String data);
}
