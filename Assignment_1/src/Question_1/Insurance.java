package Question_1;
class Insurance extends Bank {
    public Insurance(String accountType, double accountBalance) {

        super(accountType, accountBalance);
    }
// method cover
    public void cover() {
        System.out.println("You are covered.");
    }
}

