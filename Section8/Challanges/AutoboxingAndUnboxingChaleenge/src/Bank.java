import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    ArrayList<Branch> branchArrayList = new ArrayList<>();
    String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }

    public void printBanksBranches() {
        System.out.println("Branch list of " + name + ":");
        for (int i = 0; i < branchArrayList.size(); i++) {
            System.out.println(branchArrayList.get(i).getName());
        }
        System.out.println("\n");
    }

    public void addBranch(String branchName) {
        boolean flag = true;
        for (Branch branchOBJ : branchArrayList) {
            if (Objects.equals(branchOBJ.getName(), branchName)) {
                flag = false;
                System.out.println("There is Branch with name like that in our Bank");
                break;
            }
        }
        if (flag) {
            Branch branch = new Branch(branchName);
            branchArrayList.add(branch);
            System.out.println("Created new Branch with name of: " + branchName);
        }
    }

    public void addCustomer(String name, String branchName, Double initialTransaction) {
        for (Branch branchOBJ : branchArrayList) {
            if (Objects.equals(branchOBJ.getName(), branchName)) {
                branchOBJ.addCustomer(name, initialTransaction);
                break;
            }
        }
    }

    public void addTransactionToCustomer(String name, String branchName, double transaction) {
        boolean flag = true;
        for (Branch branchOBJ : branchArrayList) {
            if (Objects.equals(branchOBJ.getName(), branchName)) {
                branchOBJ.addTransactionToCustomer(name, transaction);
                System.out.println("");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("There is no customer with name like that");
        }
    }

    public void showCustomersOfBranch(String branchName) {
        for (Branch branchOBJ : branchArrayList) {
            if (Objects.equals(branchOBJ.getName(), branchName)) {
                System.out.println("Customer list of Branch '" + branchOBJ.getName() + "'");

                for (int i = 0; i < branchOBJ.getCustomerArrayList().size(); i++) {
                    System.out.println(branchOBJ.getCustomerArrayList().get(i).getName()+ " " + branchOBJ.customerArrayList.get(i).getTransactions());
                }
            }
        }
    }

}
