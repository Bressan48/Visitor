package hospital;

public class Paciente implements Pessoa {

    private int prontuario;
    private String nome;
    private Quarto quarto;

    public Paciente(int prontuario, String nome, Quarto quarto) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.quarto = quarto;
    }

    public int getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroQuarto() {
        return this.quarto.getNumero();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPaciente(this);
    }

}
