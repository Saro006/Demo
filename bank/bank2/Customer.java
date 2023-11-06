package encapsulation.bank2;

import encapsulation.bank.Acccount;

public class Customer extends Acccount {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.location = "Mysore";
       
        c1.info();
        System.out.println(c1.location);
    }
}
