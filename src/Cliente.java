import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Investimento> investimentos;

    public Cliente(String nome) {
        this.nome = nome;
        this.investimentos = new ArrayList<Investimento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public String toString(){
        String investimentosString = "";

        for (Investimento investimento : investimentos){
            investimentosString += investimento + "\n";
        }

        return "Nome: " + nome + "\nInvestimentos: " + investimentosString;
    }
}
