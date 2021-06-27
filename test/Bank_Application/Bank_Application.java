package Bank_Application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bank_Application {
    Bank_App myBank_Phb;

    @Test
    public void TestThatYouCanOpenAccount(){
        myBank_Phb = new Bank_App("zinkur","samuel", 0.0);
        myBank_Phb.getFirstName();
        assertEquals("zinkur",myBank_Phb.getFirstName());
    }
    @Test
    public void testThatAccountCanHaveLastName(){
        myBank_Phb = new Bank_App("zinkur","samuel",0.0);
        myBank_Phb.getLastName();
        assertEquals("samuel",myBank_Phb.getLastName());
    }
    @Test
    public void testThatAccountCanHaveBalance(){
        myBank_Phb = new Bank_App("zinkur","samuel",0.0);
        myBank_Phb.getBalance();
        assertEquals(0.0,myBank_Phb.getBalance());
    }
    @Test
    public void testThatICanWithdrawFromAccount(){
        myBank_Phb = new Bank_App("zinkur","samuel",50000.00);
        myBank_Phb.deposit(200);
        assertEquals(50200,myBank_Phb.getBalance());
    }
}
