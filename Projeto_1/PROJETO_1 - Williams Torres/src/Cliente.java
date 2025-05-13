public class Cliente {
    private String nome;
    private int idade;
    private double saldo;

    public Cliente(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    public void mostrarInformacoes() {
        System.out.println("Cliente: " + nome + ", Idade: " + idade + ", Saldo: " + saldo);
    }

    public void atualizarSaldo(double valor) {
        this.saldo += valor;
    }

    // Getters e Setters opcionais
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
