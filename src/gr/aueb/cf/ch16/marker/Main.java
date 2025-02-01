package gr.aueb.cf.ch16.marker;

public class Main {
    public static void main(String[] args) {
//        Ορίζουμε ένα attachment
        Attachment attachment = new Attachment("vat","pdf");
        archive(attachment);
    }

    /**
     * Πολυμορφική μέθοδος
     * @param iArchivable
     */
    public static void archive(IArchivable iArchivable){
//        Το instanceof ελέγχει: Είναι αυτό το instance, ενα instance αυτης της κλάσης?
        if (iArchivable instanceof Attachment) {
//            Τότε τύπωσε..
//            Πρέπει να κάνω typecast σε attachment!!
            System.out.println(((Attachment)iArchivable).getFilename() + "." +((Attachment)iArchivable).getExtension() + "is archivable");
        }
//        Αλλιώς πές του ότι δεν είναι instance της κλάσης.
        else {
            System.out.println("Document is not archiveable");
        }
    }
}
