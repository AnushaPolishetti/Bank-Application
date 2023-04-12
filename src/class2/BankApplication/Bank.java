package class2.BankApplication;

public interface Bank {

    public int checkBalance(String password);

    public String addMoney(int money);

    public String withdrawMoney(int money, String password);


    public String changePassword(String oldPassword,String newPassword);

    public double calculateRateOfInterest(int years,String Password);

    /*
      //ToDO we will transfer money with in the same bank
     transfer Money with in the same bank
   */
}
