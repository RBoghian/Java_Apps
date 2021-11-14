package my.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        //bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney",true);

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide already exists");
        }
    }
}
