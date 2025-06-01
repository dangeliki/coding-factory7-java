package gr.aueb.cf.ch20.enums;

public enum AccountType {

    DEPOSIT("DP"),        //Ordinal 0
    SAVINGS("SA"),        //Ordinal 1
    CURRENT("CU");       //Ordinal 2

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
