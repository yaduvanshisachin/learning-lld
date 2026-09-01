package DesignPatterns.COR;

abstract class MoneyHandler {
    protected  MoneyHandler nexHandler;

    public MoneyHandler() {
        this.nexHandler = null;
    }

    public void setNextHandler(MoneyHandler next) {
        this.nexHandler = next;
    }

    abstract void dispense(int amount);
}


class ThousandHanler extends MoneyHandler {
    private int noteCount;

    ThousandHanler(int notes) {
        this.noteCount = notes;
    }

    @Override
    void dispense(int amount) {
        int notesNeeded = amount / 1000;
        
        if(notesNeeded > noteCount) {
            notesNeeded = noteCount;
            noteCount = 0;

        } else {
            noteCount -= notesNeeded;
        }

        if(notesNeeded > 0)
            System.out.println("Dispensing..." + "x $1000 notes");

        int remainingAmount = amount - (notesNeeded * 1000);

        if(remainingAmount > 0) {
            if(nexHandler != null) 
                nexHandler.dispense(remainingAmount);
            else
                System.out.println("amount can not be fullfilled");
        }
    }
}