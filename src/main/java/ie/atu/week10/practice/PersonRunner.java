package ie.atu.week10.practice;

public class PersonRunner {
    public static void main(String[] args) {
        Customer part1 = new Customer("Mark","h65", "123", 321,false);
        Customer part2 =new Customer();

        System.out.println(part1);

        part2.setName("Mike");
        part2.setAddress("h75");
        part2.setTelephoneNumber("086");
        part2.setCustomerNumber(1010);
        part2.setMailingList(true);
        System.out.println(part2);

        PreferredCustomer part3 = new PreferredCustomer(2300);
        part3.customerDiscount(part3.getPriceAmount());
        System.out.println(part3);

    }
}
