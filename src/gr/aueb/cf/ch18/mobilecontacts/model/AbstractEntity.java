package gr.aueb.cf.ch18.mobilecontacts.model;

public abstract class AbstractEntity {
    private Long id;

//    Τον default constractor μας τον δίνει η java

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
