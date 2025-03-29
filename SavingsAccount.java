import java.util*;
import java.io*;
class SavingsAccount extends CheckingAccount(){
    double interestRate=.05d
    
    public static void main(String[] args){
    SavingsAccount sa= new SavingsAccount();
    sa.start();
    
    calcInterest(){
        double interestRate= this.balance + this.interestRate;
        this.balance += interestRate
        System.out.println("New Balance:"+ this.getBalanceString());
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate
    }
    
    public double getInterestRate(){
        return this.interestRate
    }

    }
}