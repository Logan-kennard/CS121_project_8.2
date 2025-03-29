import java.util*;
import java.io*;
class CheckingAccount implements HasMenu{
    double balance

    public static void main(String[] args){
        CheckingAccount ca= new CheckingAccount();
        ca.start();

    public CheckingAccount(){
        this.balance=0d;
    } 
    
    public CheckingAccount(double balance){
        this.balance=balance
    }
    
    public void start(){
        boolean keepGoing=true;
        while(keepGoing){
            String reponse= menu();
            if(reponse.equals("1"))
            checkBalance()
            else if (reponse.equals("2"));
            makeDeposit();
            else if (reponse.equals("3"));
            makeWithdrawal();
            else (reponse.equals("0"))
            System.out.println("Goodbye");
            false 

        }
    
    
    public string menu(){
        System.out.print("Plese enter Username:");
        System.out.print("Plese enter Pin");
        System.out.print("0) Exit");
        System.out.print("1) Check Balance");
        System.out.print("2) Make a Deposit ");
        System.out.print("3) Make a Withdraw");
        System.input.nextLine();

    }
    

    }
    public double getBalance(){
        return this.balance
    }
    public String getBalanceString(){
        String result= String.format("$%.02f", this.balance);
        return result;
    }
    public void setBalance(double balance){
        return this.result
        
    }
    public void checkBalance(){
        System.out,println("Curent Balance:" this.getBalanceString());

    }
    private double getDouble(){
        Scanner input. new Scanner (System.in);
        String sResult= input.nextline();
        double result= 0d;
        try{
        }result= Double.parseDouble(sResult);
            catch(Excaption e){
                System.out.println("not a legal input. Changing to 0");
                result=0d}
    }
        return result 
    }
    public void makeDeposit(){
        System.out.print("How much do you want to depost:");
        double depost= this.getDouble();
        this.balance += depost;
        System.out.print("New Balance" + this.getBalanceString() );
    }
    public void makeWithdrawal(){
        System.out.print("What would you like to witdraw");
        double withdraw= this.getDouble();
        if (withdraw > this.balance){
            System.out.print("Insuficent funds");
        }

    }

}