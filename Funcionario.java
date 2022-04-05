public class Funcionario{
    String Nome;
    String CPF;
    double Salario;
    String Departamento;
    double Bonus;
    public double getBonus() {
        return Bonus;
    }
    public void setBonus(double bonus) {
        Bonus = bonus;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
}