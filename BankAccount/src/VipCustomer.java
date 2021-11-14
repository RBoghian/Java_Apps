public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email=email;
    }
    public VipCustomer(String name, int creditLimit){
        this(name,creditLimit,"unknownemail");
    }
    public VipCustomer(){
        this("DEFAULT",999,"EMAIL");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
