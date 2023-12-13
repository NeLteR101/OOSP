class AESEncryption extends Encryption {
    public AESEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void encrypt(String data) {
        System.out.println("Шифрование AES: " + algorithm.encrypt(data));
    }
}