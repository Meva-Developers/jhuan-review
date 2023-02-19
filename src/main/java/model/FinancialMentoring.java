package model;

public class FinancialMentoring {
    private int senha = 2323;

    public void validar(Validation i) {
        boolean validou = i.validar(this.senha);
        if (validou) {
            System.out.println("Mentoria liberada!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}