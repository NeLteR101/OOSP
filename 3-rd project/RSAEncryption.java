class RSAEncryption extends Encryption {
    public RSAEncryption(EncryptionAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void encrypt(String data) {
        System.out.println("Шифрование RSA: " + algorithm.encrypt(data));
    }
}