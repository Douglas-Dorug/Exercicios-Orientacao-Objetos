package exercicios.exercicio_2;

public class TesteDaClasse {
    public static void main(String[] args) {
        System.out.println("Começando o teste");

        Carro carro = new Carro("Ford","Ka",2020);
        carro.setVariante("Top das galaxias");

        System.out.println("Caracteristicas do carro: \nMarca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() + "\nAno:" + carro.getAno()
                + "\nVariante: " + carro.getVariante());

        System.out.println("Fim do teste!");
    }
}
