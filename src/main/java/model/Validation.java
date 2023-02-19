package model;

//quem utiliza a interface precisa implementar o método
public interface Validation {

    public abstract void setSenha(int senha);
    public abstract boolean validar(int senha);
}
