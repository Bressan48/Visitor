package padroescomportamentais.visitor;

public class Enfermeiro implements Pessoa {

    private int coren;
    private String nome;
    private float salario;

    public Enfermeiro(int coren, String nome, float salario) {
        this.coren = coren;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCoren() {
        return coren;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEnfermeiro(this);
    }

}
