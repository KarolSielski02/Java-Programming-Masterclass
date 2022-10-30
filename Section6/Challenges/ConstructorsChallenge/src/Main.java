public class Main {
    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount("90321332423123", 14365.45, "Karol", "mrkarlos2002@gmail.com", "+696942816");

        myBankAccount.deposit(2000.00);
        myBankAccount.withdraw(200);

        VipCustomer IceCube = new VipCustomer();
        System.out.println(IceCube.getCreditLimit() + " " + IceCube.getEmail() + " " + IceCube.getName());
        VipCustomer TwoPac = new VipCustomer("Two Pac", "twopac@gmail.com");
        System.out.println(TwoPac.getCreditLimit() + " " + TwoPac.getEmail() + " " + TwoPac.getName());
        VipCustomer Biggie = new VipCustomer("Biggie", 10000000000L, "biggie.co@gmail.com");
        System.out.println(Biggie.getCreditLimit() + " " + Biggie.getEmail() + " " + Biggie.getName());
    }
}