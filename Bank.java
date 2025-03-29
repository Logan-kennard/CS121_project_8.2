import javia.io*;
class Bank implements HasMenu{
  
    Admin admin
    ArrayList customers
  public static void main(String[] args){
        Bank  b= new.Bank();
        b.start()
    
    public Bank(){
        CheckingAccount();
        SavingsAccount();
        calcIntrest();
        Customers{Alice,Bob,Cidny}
    }
   
    //void loadSampleCustomers()
    //void saveCustomers()
    //void loadCustomers()
    public void reportAllUsers(){
        System.out.print(CheckingAccount() + SavingsAccount());
        
    }
    public void addUser()
    Scanner input= new Scanner(System.in);
    
    public void applyInterest(){
        
    }

    public void loginAsCustomer(){
        System.out.println("User Name:");
        String.userNameIn=input.nextln();
        System.out.println("PIN");


        Customer currentCustomer= null;
        for (Customer customer; customer){
            if(customer.login(userNameIn, pinIn)){
                currentCustomer= customer;
            }
        }
        if(currentCustomer==null){
            System.out.println("Customer not found.");
        else{
            currentCustomer.start();
        }
        }
    }
    public string menu(){
        Scanner input= new Scanner(System.in)
        System.out.println("Welcome to the bank plese select one of the options.");
        System.out.println();
        System.out.println("0) Exit ");
        System.out.println("1) Admin Login");
        System.out.println("2) Customer Login");
        System.out.println();
        System.out.println("Action:");
        String result = input.next.line();
        return result 
    }
    public void start(){
        boolean keepGoing=true;
        while(keepGoing){
            String reponse= menu();
            if(reponse.equals("1"))
            startAdmin()
            else if (reponse.equals("2"));
            loginAsCustomer();
            else (reponse.equals("0"))
            System.out.println("Goodbye");
            false 
    }
    publc void startAdmin(){
        boolean keepGoing=true;
        while(keepGoing){
            String reponse= menu();
            if(reponse.equals("1"))
            reportAllUsers()
            else if (reponse.equals("2"));
            addUser();
            else if (reponse.equals("3"));
            applyInterest();
            else (reponse.equals("0"))
            System.out.println("Goodbye");
            false 
    }

}
  