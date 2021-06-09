package exercicios.exercicio_3;

public class Exercicio_3 {

    public static void main(String[] args) {
        System.out.println("Iniciando teste");

        Funcionario faxineiro = new Funcionario();
        faxineiro.setSalario(1500);
        faxineiro.setNome("Jenival");
        System.out.println(faxineiro.calculaImposto() + "R$ De imposto pago por " + faxineiro.getNome());

        Funcionario gerente = new Gerente();
        gerente.setSalario(15000);
        gerente.setNome("Rodrigues");
        System.out.println(gerente.calculaImposto() + "R$ De imposto pago por " + gerente.getNome());

        Funcionario supervisor = new Supervisor();
        supervisor.setSalario(8000);
        supervisor.setNome("Jeremias");
        System.out.println(supervisor.calculaImposto() + "R$ De imposto pago por " + supervisor.getNome());

        Funcionario atendemte = new Atendente();
        atendemte.setSalario(4000);
        atendemte.setNome("Durval");
        System.out.println(atendemte.calculaImposto() + "R$ De imposto pago por " + atendemte.getNome());

    }
}
