package w1l2.CS390_Assignments.w1l3;

public class CustomerTester {

    public static void main(String[] args) {
        Address ad1= new Address("Winfield","charlotte","North Carolina","28236");
        Address ad2= new Address("Winfield","Chicago","Illinois","28236");
        Address ad3= new Address("Delane Ave","Chicago","Illinois","28569");

        Customer lwam = new Customer("Lwam","haile","123456");
        Customer mercy= new Customer("mercy","Arkan","565656");
        Customer Hana = new Customer("Hana","Fillimon","1112211");

        lwam.setBillingAddress(ad1);
        lwam.setShippingAddress(ad1);

        mercy.setBillingAddress(ad2);
        mercy.setShippingAddress(ad2);

        Hana.setBillingAddress(ad3);
        Hana.setShippingAddress(ad3);

        Customer[] customers={lwam, mercy, Hana};
        for (Customer ans : customers){
            if (ans.getBillingAddress().getCity().equalsIgnoreCase("Chicago") )
            System.out.println(ans);
        }
    }
}
