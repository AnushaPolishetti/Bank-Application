package class2.BankApplication;

import java.util.UUID;

public class SBI implements Bank{

       private int balance;
       private String accountNo;
       private String password;
       public String name;
       public static double rateOfInterest;


    public SBI(int balance, String password, String name) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(password == this.password) return balance;
        return -1;
    }


    @Override
    public String addMoney(int money) {

        balance = balance + money;
        String message = money + "has been added to bank Account " + accountNo + " The total balance is now "+ balance;
        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {

        if(password == this.password){
            if(money > balance){
                return " Insufficient balance";
            }
            else{
                balance = balance - money;
                return "Money withdraw sucessfully";
            }

        }
        else return " Wrong Password ";

    }


    @Override
    public String changePassword(String oldPassword, String newPassword) {

       // this.password means the current password for the account
        if(this.password == oldPassword){
            this.password = newPassword;
            return " Password has been sucessfully!!";
        }
        else return " Wrong Password";

    }

    @Override
    public double calculateRateOfInterest(int years, String Password) {
        double interest = (balance * rateOfInterest*years)/100;
        return interest;
    }



}
