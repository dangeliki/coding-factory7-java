package gr.aueb.cf.ch16.marker;

public class Attachment implements IArchivable{

//    Private πεδία
    private String filename;
    private String extension;

//    Constructors

    public Attachment() {

    }
    public Attachment(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }

//    Getters
    public String getFilename() {
        return filename;
    }
    public String getExtension() {
        return extension;
    }

//    Setters
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
