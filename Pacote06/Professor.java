package Pacote06;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float aum) {
        this.salario += aum;

    }

    /**
     * @return String return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return float return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
