import java.util.ArrayList;
import java.util.Objects;

public class Branch {

    private String name;
    ArrayList<Customer> customerArrayList = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void addCustomer(String name, Double startingTransaction) {
        boolean flag = true;
        for (Customer customerOBJ : customerArrayList) {
            if (customerChecker(name, customerOBJ)) {
                flag = false;
                System.out.println("There is Customer with name like that in our Branch");
                break;
            }
        }

        if (flag) {
            Customer customer = new Customer(name);
            customer.addTransactions(startingTransaction);
            customerArrayList.add(customer);
            System.out.println("Created customer '" + name + "' in branch called: " + this.name + ". With initial Transaction of: " + startingTransaction + "$\n");
        }
    }

    public void addTransactionToCustomer(String name, Double transactionAmount) {
        boolean flag = false;

        for (Customer customerOBJ : customerArrayList) {
            if (customerChecker(name, customerOBJ)) {
                customerOBJ.addTransactions(transactionAmount);
                System.out.println("There is Customer with name '" + name + "' in our Branch, we have added transaction for the amount " + transactionAmount + "$");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("ERROR: There is no customer with such name, provide correct Name");
        }
    }

    private boolean customerChecker(String name, Customer customerOBJ) {
        return Objects.equals(customerOBJ.getName(), name);
    }
}
