package model;

public class UsefulValidation {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public boolean validar(int senha) {
        if (this.senha == senha)  {
            return true;
        } else {
            return false;
        }
    }
}
