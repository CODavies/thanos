package ourFirstTddClas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    @Test
    public void accountCanBeDepositedIntoTest() {
        Account tonIAccount = new Account();
//        when
        tonIAccount.depositMoney(2500);
//       assert
        double balance = tonIAccount.getAccountBalance();
        assertEquals(2500, balance);
    }

    @Test
    @DisplayName("Money can be deposited twice Test")
    public void accountCanReceiveDoubleDeposit() {
        Account sarahAccount = new Account();
        sarahAccount.depositMoney(2500);
        assertEquals(2500, sarahAccount.getAccountBalance());
    }
@Test
    public void accountCannotReceiveNegativeDepositTest(){
        Account humbleAccount = new Account();
        humbleAccount.depositMoney(-9873);
        assertEquals(0, humbleAccount.getAccountBalance());
}
@Test
    public void moneyCanBeWithdrawnFromAccountWithValidPinTest(){
        Account babasolaAccount = new Account();
        babasolaAccount.depositMoney(7000);
        babasolaAccount.setPin(1234);
        babasolaAccount.withdrawMoney(2000,1234);
//        assert
    assertTrue(babasolaAccount.getAccountBalance()==5000);
}
@Test
    void moneyCannotBeWithdrawnWithWrongPin(){
    Account babasolaAccount = new Account();
    babasolaAccount.depositMoney(7000);
    babasolaAccount.setPin(1234);
    babasolaAccount.withdrawMoney(2000,2212);
//        assert
    assertTrue(babasolaAccount.getAccountBalance()==7000);

}
}


