public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(456, 8000, "Corrida", 4);

        corrida.registrarCarro(11.2, 8.8, 33, "placa1");
        corrida.registrarCarro(40.2, 3.5, 22, "placa2");
        corrida.registrarMoto(50.3, 7.0, 44, "placa3");
        corrida.registrarMoto(60, 2.9, 43, "placa4");

        corrida.socorrerMoto("placa4");
        corrida.socorrerCarro("placa2");

        corrida.removerVeiculoPorPlaca("placa3");

        Veiculo veiculo = corrida.buscarVencedor();
        System.out.println("Vencedor: " + veiculo);
    }
}