package class2.BankApplication;

public class Main {

    public static void main(String []args){



         SBI.rateOfInterest = 7;
         HDFC.rateOfInterest = 8;

        SBI account1 = new SBI(100000,"123","dev");
        SBI account2 = new SBI(150000,"456","Anusha");
        HDFC account3 = new HDFC(120000,"789","Rahul");

        int balance = account1.checkBalance("124");
        System.out.println(" the balance for account1 is"+balance);

        int balanceCheck = account1.checkBalance("123");
        System.out.println(" the balance for account1 is"+balanceCheck);


        String bankMessage = account2.addMoney(50000);
        System.out.println(bankMessage);

        String message1 = account3.withdrawMoney(10000,"789");
        System.out.println(message1);


        double interest = account1.calculateRateOfInterest(20,"123");
        System.out.println("totoal interest you will get is "+ interest);


    }
}
