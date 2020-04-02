package pl.pawtel.junit_banking;

import org.junit.Test;

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

    @Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch() throws Exception {
    double balance = account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
         account.withdraw(600.00, false);
         fail("Should have thrown an IllegalArgument Exception");
    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("after tests");
    }
}