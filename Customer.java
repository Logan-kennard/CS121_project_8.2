import java.util*;
import java.io*;
class Customer extends User{
    CheckingAccount checking 
    SavingsAccount savings
    public static void main(String[] args){
    public Customer()
    public Customer(usernName, PIN)
    public void start(){
        boolean keepGoing=true;
        while(keepGoing){
            String reponse= menu();
            if(reponse.equals("1"))
            BalanceAcount()
            else if (reponse.equals("2"));
            SavingsAccount();
            else if (reponse.equals("3"));
            changePin();
            else (reponse.equals("0"))
            System.out.println("Goodbye");
            false 
    }
    public string menu(){
        System.out.print("0) Exit");
        System.out.print("1) Manage Checking account");
        System.out.print("2) Manage Savings Account");
        System.out.print("3) Change Pin ");
        System.input.nextLine();
    }
    public void changePin(){
        if(pin.matches("^//d(4)$"));
        this.PIN=new_pin;
        this.new_pin

    }
    public string getReport(){
        System.out.println(CheckingAccount());
        System.out.println(SavingsAccount());
    }
    }
}