package model;

import java.util.Date;

public abstract class AllCustomers {
    private String nome;
    private String cpf;
    private double despesas;
    private String profissao;
    private Date dataDeNascimento;

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public abstract double getCupomDesconto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getDespesas() {
        System.out.println("O seu gasto do mês foi: ");
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}