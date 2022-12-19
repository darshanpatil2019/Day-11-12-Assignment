package OOPsProblems;

import java.util.Scanner;

interface ATM {
    int Debit();
}

class SBI implements ATM {
    private static int availableBalance = 30000;
    private static int pin = 1234;

    Scanner sc = new Scanner(System.in);

    @Override
    public int Debit() {
        //Amount
        System.out.println("Enter a Amount");
        int debitAmount = sc.nextInt();

        //Pin
        System.out.println("Enter a Pin");
        int pin = sc.nextInt();

        //Validate Pin

        if (pin == SBI.pin) {
            if (availableBalance >= debitAmount) {
                availableBalance -= debitAmount;
                if (debitAmount <= availableBalance) {
                    System.out.println("Your Transaction has been Successful");

                    return debitAmount;
                } else {
                    System.out.println("Sorry ! Debit amount exceeded account balance.");
                }
            } else {
                System.out.println("Invalid Pin");
            }
        }
        return Debit();

    }
}

class Account {
    public static void main(String[] args) {
        ATM atm = new SBI();
        atm.Debit();
    }
}