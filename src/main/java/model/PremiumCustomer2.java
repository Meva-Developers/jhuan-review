package model;

public class PremiumCustomer2 extends AllCustomers implements Validation {
    @Override
    public double getCupomDesconto() {
        System.out.println("Seu cupom do mês é: ");
        return 100;
    }

    private UsefulValidation authenticator;
    public PremiumCustomer2() {
        this.authenticator = new UsefulValidation();
    }
    @Override
    public void setSenha(int senha) {
        this.authenticator.setSenha(senha);
    }

    @Override
    public boolean validar(int senha) {
        return this.authenticator.validar(senha);
    }
}
