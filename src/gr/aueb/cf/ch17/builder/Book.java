package gr.aueb.cf.ch17.builder;

//BUILDER DESIGN PATTERN

//Επειδή θέλουμε να είναι immutable, κάνουμε final τα πεδία
public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;


//    Nested class (έχουν πρόσβαση στα πεδία της εξωτερικής κλάσης)
//    Ακριβώς με τα ίδια πεδία όπως το book αλλά έστω τα 2 πεδία είναι υποχρεωτικά
    public static class Builder {
        private final long id;
        private final String isbn;
//        Ας υποθέσουμε ότι τα 2 αυτά πεδία είναι προεραιτικά και τα αρχικοποιώ με null
        private String author = "";
        private String title = "";
//        Ο constructor για τα προεραιτικά
        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }
//        Τα προαιρετικά πεδία αρχικοποιούνται με Setters
//        Επιστρέφουν builder, αρα μπορούν να γίνουν chaining
        public Builder author(String author) {
            this.author = author;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
//        Επιστρέφουμε από τον builder ένα book ακριβώς με τα ίδια πεδία με το book
        public Book build() {
            return new Book(this);
        }
    }

//    private Constructor του book (κάνουμε inject τον builder στον private constructor του book
    private Book(Builder builder){
        this.id = builder.id;
        this.author= builder.author;
        this.title= builder.title;
        this.isbn= builder.isbn;
    }

//    Getters
    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
