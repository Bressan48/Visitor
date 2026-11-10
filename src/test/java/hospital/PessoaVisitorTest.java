package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirPaciente() {
        Paciente paciente = new Paciente(1, "Ana", new Quarto("101"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Paciente{prontuario=1, nome='Ana', quarto=101}", visitor.exibir(paciente));
    }

    @Test
    void deveExibirMedico() {
        Medico medico = new Medico(1, "Maria", "Cardiologia");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Medico{crm=1, nome='Maria', especialidade='Cardiologia'}", visitor.exibir(medico));
    }

    @Test
    void deveExibirEnfermeiro() {
        Enfermeiro enfermeiro = new Enfermeiro(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Enfermeiro{coren=1, nome='Pedro', salario=5000.0}", visitor.exibir(enfermeiro));
    }

}
