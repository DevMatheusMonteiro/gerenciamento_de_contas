public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro");

        Acao acao = new Acao(200, 0.1f, 12, cliente);
        Acao acao2 = new Acao(300, 0.1f, 10, cliente);

        cliente.addInvestimento(acao);
        cliente.addInvestimento(acao2);

        System.out.println(cliente);
    }
}