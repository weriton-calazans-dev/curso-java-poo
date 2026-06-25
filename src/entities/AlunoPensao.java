package entities;

public class AlunoPensao {
    private String nome;
    private String gmail;
    private int quarto;

    public AlunoPensao(String nome, String gmail, int quarto) {
        this.nome = nome;
        this.gmail = gmail;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return
                "nome: " + nome +
                ", gmail: " + gmail +
                ", quarto: " + quarto ;
    }
}
