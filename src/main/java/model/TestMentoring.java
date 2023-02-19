package model;

public class TestMentoring {
    public static void main(String[] args) {
        PremiumCustomer c1 = new PremiumCustomer();
        c1.setSenha(2323);

        PremiumCustomer2 c2 = new PremiumCustomer2();
        c2.setSenha(1010);

        FinancialMentoring fi = new FinancialMentoring();

        fi.validar(c1);
        fi.validar(c2);
    }
}
