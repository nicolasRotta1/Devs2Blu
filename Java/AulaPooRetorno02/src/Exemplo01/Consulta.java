package Exemplo01;
import java.util.Random;
public class Consulta {
    private int id;
    private String dataConsulta;
    private String observacoes;
    private Paciente paciente;
    private Medico medico;

    public Consulta(String dataConsulta, String observacoes, String blob, String jeribaldo){
        this.id = new Random().nextInt(1000);
    }

    public Consulta(String dataConsulta, String observacoes) {
        this.id = new Random().nextInt(1000);
        this.dataConsulta = dataConsulta;
        this.observacoes = observacoes;
        this.paciente = paciente;
    }

    public Consulta(String dataConsulta, String observacoes, Paciente paciente, Medico medico) {
        this.id = new Random().nextInt(1000);
        this.dataConsulta = dataConsulta;
        this.observacoes = observacoes;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getId() {
        return id;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
