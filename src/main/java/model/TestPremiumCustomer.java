package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestPremiumCustomer {
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) throws ParseException {
        PremiumCustomer pc = new PremiumCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        pc.setNome(sc.next());

        Scanner scc = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento:");
        pc.setDataDeNascimento(format.parse(scc.next()));

        Scanner cc = new Scanner(System.in);
        System.out.println("Informe seu cpf:");
        pc.setCpf(cc.next());

        Scanner c = new Scanner(System.in);
        System.out.println("Informe sua profissão:");
        pc.setProfissao(c.next());

        Scanner dc = new Scanner(System.in);
        System.out.println("Informe suas despesas:");
        pc.setDespesas(dc.nextDouble());

        System.out.println(pc.getNome());
        System.out.println(pc.getCpf());
        System.out.println(pc.getProfissao());
        System.out.println(pc.getDespesas());
        System.out.println(format.format(pc.getDataDeNascimento()));

        Scanner nn = new Scanner(System.in);
        System.out.println("Coloque sua senha:");
        pc.setSenha(nn.nextInt());
        boolean validou = pc.validar(2345);
        System.out.println(validou);

        System.out.println(pc.getCupomDesconto());

    }

}
