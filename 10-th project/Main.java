public class Main {
    public static void main(String[] args) {
        ATMFacade atmFacade = new ATMFacade();
        atmFacade.withdrawCash(500);
        int balance = atmFacade.checkBalance();
        System.out.println("Account balance: " + balance);
        atmFacade.replenishAccount(200);
    }
}