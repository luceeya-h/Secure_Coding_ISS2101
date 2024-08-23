package Question_1;
//This is where the program runs
public class Main {
    public static void main(String[] args) {
        // declaring variables
        String initials = "CLS";
        double regNumber = 230071;
//creating an instance of a class called b
        Bank b = new Bank(initials, regNumber);
        b.display();
    }
    }