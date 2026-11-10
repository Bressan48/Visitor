package hospital;

public interface Visitor {

    String exibirPaciente(Paciente paciente);
    String exibirMedico(Medico medico);
    String exibirEnfermeiro(Enfermeiro enfermeiro);

}
