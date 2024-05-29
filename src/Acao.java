public final class Acao extends Investimento{
    private int tempoEmMeses;


    public Acao(float saldo, float remuneracao, int tempoEmMeses, Cliente cliente) {
        super(saldo, remuneracao, cliente);
        this.tempoEmMeses = tempoEmMeses;
    }

    public int getTempoEmMeses() {
        return tempoEmMeses;
    }

    public void setTempoEmMeses(int tempoEmMeses) {
        this.tempoEmMeses = tempoEmMeses;
    }

    public float calcular(){
        float remuneracao = getRemuneracao() / 2;

        if(tempoEmMeses > 11){
            remuneracao = getRemuneracao();
        }

        return getSaldo() * (1 + remuneracao);
    }
}
