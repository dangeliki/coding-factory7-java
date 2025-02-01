package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

//Προσφέρει κάποιες υπηρεσίες. Δίνει services
//Είναι σαν queries
public interface ICustomerDAO {
    void addCustomer(Customer customer);
    void updateCustomer(Long id, Customer customer);
    boolean removeCustomer(Long id);
    Customer getCustomerById(Long id);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer[] getCustomersByRegion(String region);
    Customer getCustomerByVat(String vat);
}
