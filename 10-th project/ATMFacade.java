
    public class ATMFacade {
        private CashWithdrawal cashWithdrawal;
        private AccountBalance accountBalance;
        private AccountReplenishment accountReplenishment;

        public ATMFacade() {
            cashWithdrawal = new CashWithdrawal();
            accountBalance = new AccountBalance();
            accountReplenishment = new AccountReplenishment();
        }


        public void withdrawCash(int amount) {
            cashWithdrawal.withdraw(amount);
        }


        public int checkBalance() {
            return accountBalance.getAccountBalance();
        }


        public void replenishAccount(int amount) {
            accountReplenishment.replenish(amount);
        }
    }

