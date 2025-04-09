package entities;
/**
 * <h3>Client,java
 * <p>Classe responsável no gerenciamento dos dados do cliente.
 * @author Artur Magioli
 * @version 1.0
 * @since   08/04/2025
 */
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


    /**
     * @param void
     * @return String de feedback
     */
    public String feedbackCliente() {
        return "Olá " + nome 
        + ", obrigado por criar uma conta em nosso banco. "
        + "Sua agência é " + agencia
        + ", conta " + NUMEROAGENCIA
        + " e seu saldo " + saldo
        + " já está disponível para saque.";
    }
}
