package SOLID.LSP;

public class Client {

    public static void main(String[] args) {

        Account s1 = new SavingsAccount();
        // s1.deposit();
        // s1.withdraw();

        PerformTransaction txn1 = new PerformTransaction();
        txn1.m1(s1);

        Account c1 = new CurrentAccount();
        txn1.m1(c1);

        FixedDepositAccount fd1 = new FixedDepositAccount();
        txn1.m1(fd1);
    }
}

class PerformTransaction {
    public void m1(Account bankAccount) {
        bankAccount.deposit();
        bankAccount.withdraw();
    }
}

interface Account {
    void deposit();
    void withdraw();
}

class SavingsAccount implements Account {

    @Override
    public void deposit() {
        System.out.println("Depositing in savings bank account...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from savings bank account...");
    }
}

class CurrentAccount implements Account {

    @Override
    public void deposit() {
        System.out.println("Depositing in current bank account...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from current bank account...");
    }
}

//whatever account you pass in m1(), it will work but you can not pass
// on FD account , withdraw method can not be called,
//so yah pe tumh child object ko substitute nhi kr skte

class FixedDepositAccount implements Account {

    @Override
    public void deposit() {
        System.out.println("Depositing into Fixed Deposit Account");
    }

    @Override
    public void withdraw() {
        throw new UnsupportedOperationException(
                "Withdrawal is not allowed before FD maturity");
    }
}