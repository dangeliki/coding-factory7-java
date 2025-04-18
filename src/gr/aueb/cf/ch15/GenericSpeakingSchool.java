package gr.aueb.cf.ch15;

public class GenericSpeakingSchool {

    private final ISpeakable iSpeakable;

    /**
     * Dependency Injection -IoC - Inversion of Control
     * Επιτυγχάνεται με την χρήση interfaces
     * @param iSpeakable
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void  learnToSpeak() {
        iSpeakable.speak();
    }
}
