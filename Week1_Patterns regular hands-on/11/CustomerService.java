public class CustomerService {
    private CustomerRepository customerRepo;

    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void displayCustomer(int id) {
        Customer c = customerRepo.findCustomerById(id);
        System.out.println("Fetched: " + c);
    }
}
