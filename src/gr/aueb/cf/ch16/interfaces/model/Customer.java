package gr.aueb.cf.ch16.interfaces.model;

/**
 * Java Bean (Data Class)
 */
public class Customer {

//    Private πεδία
    private Long id;
    private String vat;
    private String region;
    private String address;
    private String lastname;
    private String firstname;
    private String phoneNumber;

//    Constructors
    public Customer() {

    }

    public Customer(Long id, String vat, String region, String address, String lastname, String firstname, String phoneNumber) {
        this.id = id;
        this.vat = vat;
        this.region = region;
        this.address = address;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phoneNumber = phoneNumber;
    }

//    Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    Getters
    public Long getId() {
        return id;
    }

    public String getVat() {
        return vat;
    }

    public String getRegion() {
        return region;
    }

    public String getAddress() {
        return address;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
