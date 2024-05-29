public abstract class Investimento implements Rendimento {
    private float saldo;
    private float remuneracao;
    private Cliente cliente;

    public Investimento(float saldo, float remuneracao, Cliente cliente){
        setSaldo(saldo);
        setRemuneracao(remuneracao);
    }

    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        if(remuneracao < 0){
            return;
        }

        this.remuneracao = remuneracao;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0){
            return;
        }

        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            return;
        }

        this.cliente = cliente;
    }

    public String toString(){
        return "Saldo" + calcular();
    }
}
