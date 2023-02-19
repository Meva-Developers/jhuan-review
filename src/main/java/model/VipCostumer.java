package model;

public class VipCostumer extends AllCustomers {

    @Override
    public double getCupomDesconto() {
        System.out.println("Seu cupom do mês é: ");
        return 25;
    }
}
