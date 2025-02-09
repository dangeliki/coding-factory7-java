package gr.aueb.cf.ch18.mobilecontacts.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact() {

    }

    public MobileContact(String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
//        Επειδη στην παρασταση υπαρχει εστω ενα string και υπαρχει ενα + , τοτε ολα τα υπολοιπα μετατρεπονται σε string
        return "Firstname: " + firstname + ", Lastname: " + lastname + ", Phone Number: " + phoneNumber;
    }

    @Override
//    Η equals παιρνει ενα obj και το συγκρινει με το this
    public boolean equals(Object other) {
        if (this == other) return true;
//        if (!(other instanceof MobileContact)) return false;
//        MobileContact that = (MobileContact) other;

        // In Java 17 το παρακάτω κάνει δύο πράγματα
        // Έλεγχο αν είναι instanceof και αν ναι μετά κάνει
        // typecast (όπως κάναμε πριν τη Java 17 με τον παραπάνω κώδικα)
        if (!(other instanceof MobileContact that)) return false;
        return Objects.equals(getFirstname(), that.getFirstname())
                && Objects.equals(getLastname(), that.getLastname())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber());
    }

    @Override
//    Επιστρεφει εναν int που ειναι μοναδικος και εξαρταται απο το state του instance - μοναδικος αριθμος για καθε instance-
//    Όταν δυο instances ειναι equals , παραγεται το ιδιο hashcode
//    Οταν γινει override το equals, τοτε θα πρεπει να γινεται παντα override και το hashcode!!!!
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPhoneNumber());
    }
}
