package pl.pawtel.junit_banking;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases");
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Jan", "Kowalski", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("after tests");
    }
}