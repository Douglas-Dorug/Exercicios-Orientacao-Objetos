package exercicios.exercicio_3;

public class Supervisor extends Funcionario{

    public double calculaImposto() {
        return this.getSalario() * 0.05;
    }
}
