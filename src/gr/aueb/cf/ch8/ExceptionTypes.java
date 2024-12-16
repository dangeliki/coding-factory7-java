package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {



    }
//    Η java απαιτει τα checked exceptions να γινονται throw στην επικεφαλιδα ή πρεπει να γινει catch
//    Στην επικεφαλιδα βαζω ΜΟΝΟ checked exc

    /**
     * 1.
     * System.in.read throws IOException
     * Since a checked exception is thrown, it has to be explicity to be thrown in method signature.
     * Or has to be caught {}
     * When this type of method/exception may be used?
     * When we dont need to handle the exception
     * Is this meaningful? No. Ideally, we want to handle the exceptions, not only propagate.
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read(); //throws IOException
    }

    /**
     * 2.
     * If we catch the exc, no need for 'throws' in method signature. And the exc not propagates.
     * Is it a good practice, not to propagate?
     * It depends. If there is a caller, then we have to propagate.
     * If there is a client / user then we do not propagate the exception.
     * @return
     */
    public static char readAnotherChar(){
        try {
            return(char) System.in.read();
//            Στην catch δηλωνω το exc και στο σωμα γραφω τις εντολες για να χειριστουμε το exc
        }catch(IOException e){
//            Κανω logging , στην πραγματικοτητα απλα γραφει με κοκκινο στην κονσολα
            System.err.println(e.getMessage());
            return ' ';

        }
    }

    /**
     * 3.
     * In this type of method/exc , we take action -- logging ,and also rethrow the exception to
     * propagate to the caller.
     *
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException {
        try {
            return(char) System.in.read();
//            Στην catch δηλωνω το exc και στο σωμα γραφω τις εντολες για να χειριστουμε το exc
        }catch(IOException e){
//            Κανω logging , στην πραγματικοτητα απλα γραφει με κοκκινο στην κονσολα
            System.err.println(e.getMessage());
//            Όταν αντι για return κανω throw το exc , βαζω και στην math signature το exc.
            throw e;

        }
    }

//    ΠΟΛΛΑΠΛΑ EXCEPTIONS
    public static char readAgainOneChar(char ch) throws IOException /*,IllegalArgumentException*/ {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }
//        } catch (IllegalArgumentException ex1){
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
    }

}
