public class Main {
    public static void main(String[] args) {
        Bank PKO = new Bank("PKO");

        PKO.addBranch("PKO in Sztum");
        PKO.printBanksBranches();

        PKO.addBranch("PKO in Malbork");
        PKO.printBanksBranches();

        PKO.addCustomer("Karol", "PKO in Sztum", 1000.00);
        PKO.addTransactionToCustomer("Karol","PKO in Sztum",200.00);
        PKO.addTransactionToCustomer("Kurwiusz","PKO in Sztum",200.00);

        PKO.addCustomer("Sandra", "PKO in Sztum", 12330.00);
        PKO.addCustomer("Marek", "PKO in Sztum", 12370.00);
        PKO.addCustomer("Szymon", "PKO in Sztum", 10.00);

        PKO.showCustomersOfBranch("PKO in Sztum");
    }
}