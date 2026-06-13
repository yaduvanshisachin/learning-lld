package SOLID.LSP;


public class LSPFollowed {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount();
        CurrentAccount c1 = new CurrentAccount();
        FixedDepositAccount fd1 = new FixedDepositAccount();
        
        s1.deposit();
        s1.withdraw();
        
        c1.deposit();
        c1.withdraw();
        
        fd1.deposit();
        
        // PerformTransaction txn = new PerformTransaction();
        // for(var account : accounts){
        //     txn.m1(account);
        // }
    }
}

interface NonWithdrawableAccout {
    void deposit();

}

interface WithdrableAccount extends NonWithdrawableAccout{
    void withdraw();
}

class SavingsAccount implements WithdrableAccount {

    @Override
    public void deposit() {
        System.out.println("Depositing in savings bank account...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from savings bank account...");
    }
}

class CurrentAccount implements WithdrableAccount {

    @Override
    public void deposit() {
        System.out.println("Depositing in current bank account...");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from current bank account...");
    }
}


// Now since FD implements NonWithdrawable account, so it does not bound to override withdraw()
class FixedDepositAccount implements NonWithdrawableAccout {

    @Override
    public void deposit() {
        System.out.println("Depositing into Fixed Deposit Account");
    }

}


//helper
// class PerformTransaction {
//     public void m1(WithdrawableAccout bankAccount) {
//         bankAccount.deposit();
//         bankAccount.withdraw();
//     }
// }