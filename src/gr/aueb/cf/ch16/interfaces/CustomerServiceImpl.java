package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

//Dependency injection
//Delegation / Composition and forwarding

public class CustomerServiceImpl {

//    Περνάω το interface για να μπορεσω να κανω dependency injection
    private ICustomerDAO iCustomerDAO;

    public CustomerServiceImpl(ICustomerDAO iCustomerDAO){
//        Ενα instance του DAO για να παρουμε τις υπηρεσιες
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer(Customer customer) throws Exception {

        try{
            if(iCustomerDAO.getCustomerByVat(customer.getVat()) != null) {
                throw new Exception("");
            }
            iCustomerDAO.addCustomer(customer);
        } catch (Exception e){
            System.err.println("");
            throw e;
        }
    }
}
