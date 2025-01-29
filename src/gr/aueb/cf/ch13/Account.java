package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

/**
 * Defines a {@link Account} class.
 * @author adonta
 * @version 0.1
 * @since 0.1
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account () {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    * Public API
     */

    /**
     * Deposits a certain amount of money
     *
     * @param amount        the amount of money to be deposited
     * @throws Exception    if the amount is negative
     */
    public void deposit(double amount) throws NegativeAmountException {
        try{
            if (amount < 0){
//                throw new Exception("The amount must not be negative");
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            System.out.println("Amount " + amount + "successfully deposited.");  //logging
        } catch (NegativeAmountException e) {
            System.err.println("Error. Amount " +amount+ "can not be negative!");
//            e.printStackTrace();    //το printstacktrace το βαζω ΜΟΝΟ στο development και ΟΧΙ στο production
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from the {@link Account}
     * based on a valid ssn checked by {@link #isSsnValid(String)}
     *
     * @param amount        the amount to be withdrawn
     * @param ssn           the given ssn
     * @throws Exception    if the ssn is invalid or the balance is not sufficient or the amount is negative
     *
     */
    public void withdraw(double amount,String ssn) throws SsnNotValidException,InsufficientBalanceException,NegativeAmountException {
        try {
            if(!isSsnValid(ssn)){
//                throw new Exception("Ssn "+ssn+"is not valid");
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance){
//                throw new Exception("Insufficient balance" +balance+ "for amount" +amount);
                throw new InsufficientBalanceException(balance,amount);
            }
            if (amount < 0) {
//                throw new Exception("The amount" +amount+ "must not be negative");
                throw new NegativeAmountException(amount);
            }

            balance = balance - amount;
            System.out.println("Amount " + amount + "successfully withdrawn.");  //logging

        } catch (SsnNotValidException | InsufficientBalanceException | NegativeAmountException e) {
            System.err.println("Error. "+e.getMessage());
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}
     *
     * @return  the Account's balance
     */
    public double getAccountBalance () {
        System.out.println("The account balance was returned");
        return getBalance();
    }

    /**
     * Returns a string representation of the {@link Account } state.
     *
     * @return      the string - based format of the {@link Account}
     *
     */
    public String accountToString(){
        return "(" +id + "," +iban + "," +firstname + "," +lastname + "," +ssn + "," +balance + " )";
    }

    //Internals
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }



}
