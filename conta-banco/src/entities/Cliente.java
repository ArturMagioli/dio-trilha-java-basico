package entities;

public class Cliente {
    private String nome;
    private String agencia;
    private final int NUMEROAGENCIA;
    private double saldo;

    public Cliente(String nome, String agencia, int numeroAgencia, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.NUMEROAGENCIA = numeroAgencia;
        this.saldo = saldo;
    }

    public String feedbackCliente() {
        return "Olá " + nome 
        + ", obrigado por criar uma conta em nosso banco. "
        + "Sua agência é " + agencia
        + ", conta " + NUMEROAGENCIA
        + " e seu saldo " + saldo
        + " já está disponível para saque.";
    }
}
