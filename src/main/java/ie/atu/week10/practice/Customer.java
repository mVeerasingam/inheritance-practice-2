package ie.atu.week10.practice;

public class Customer extends Person{
    private int customerNumber;
    private boolean mailingList;

    public Customer(){
    }

    public Customer(String name, String address, String telephoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "customeNumberr = " + customerNumber + '\'' + "mailingList = " + mailingList;
    }
}
