package inheritanceDemo;

import methodOverloading.Operations;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new SoldierCreditManager());
    }
}
