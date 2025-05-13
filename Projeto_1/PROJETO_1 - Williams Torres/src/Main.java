public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("João Silva", 30, 1000.0);

        // Exibindo as informações iniciais
        cliente1.mostrarInformacoes();

        // Atualizando o saldo
        cliente1.atualizarSaldo(500.0);

        // Exibindo as informações após atualização
        cliente1.mostrarInformacoes();
    }
}
