package padroescomportamentais.visitor;

public class Medico implements Pessoa {

    private int crm;
    private String nome;
    private String especialidade;

    public Medico(int crm, String nome, String especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMedico(this);
    }

}
