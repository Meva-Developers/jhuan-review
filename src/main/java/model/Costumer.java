package model;

public class Costumer extends AllCustomers {
    @Override
    public double getCupomDesconto() {
        System.out.println("Cupom do mês, mas pode melhorar assinando o premium: ");
        return 10;
    }
}
