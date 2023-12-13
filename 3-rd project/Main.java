public class Main {
    public static void main(String[] args) {
        
        EncryptionAlgorithm aesAlgorithm = new AESAlgorithm();
        EncryptionAlgorithm rsaAlgorithm = new RSAAlgorithm();

        Encryption aesEncryption = new AESEncryption(aesAlgorithm);
        Encryption rsaEncryption = new RSAEncryption(rsaAlgorithm);

        aesEncryption.encrypt("Текст для шифрования AES");
        rsaEncryption.encrypt("Текст для шифрования RSA");
    }
}