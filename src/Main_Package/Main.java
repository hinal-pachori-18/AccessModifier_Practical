package Main_Package;
import Account_Package.Account;
public class Main {
    public static void main(String[] args)
    {
        //Call the method of Another
        Account obj = new Account();
        obj.setName("Aman");
        obj.setAcc_no(566618887);
        obj.setEmail("Jinal2323@gmail.com");
        obj.setAmount(40000);

        //Call the method of Account Class
        System.out.println("Details of User ");
        System.out.println("Name of User "+obj.getName());
        System.out.println("Account Number of User "+obj.getAcc_no());
        System.out.println("Email of User "+obj.getEmail());
        System.out.println("Amount of User "+obj.getAmount());
    }
}