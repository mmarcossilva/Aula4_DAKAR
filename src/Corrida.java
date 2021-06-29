import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private double distancia;
    private double premeioEmDolares;
    private String nome;
    private int quantidadeDeVeiculosPermitido;
    private List<Veiculo> veiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(double distancia, double premeioEmDolares, String nome, int quantidadeDeVeiculosPermitido) {
        this.distancia = distancia;
        this.premeioEmDolares = premeioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitido = quantidadeDeVeiculosPermitido;
        this.veiculos = new ArrayList<Veiculo>();
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        if(quantidadeDeVeiculosPermitido == veiculos.size()){
            System.out.println("Não é permitido adicionar mais veiculos");
        }else {
            veiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        if(quantidadeDeVeiculosPermitido == veiculos.size()){
            System.out.println("Não é permitido adicionar mais veiculos");
        }else {
            veiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        this.veiculos.remove(buscarVeiculo(placa));
    }

    public Veiculo buscarVeiculo(String placa){
        return this.veiculos.stream().filter(x -> x.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    public Veiculo buscarVencedor(){
        return this.veiculos.stream().max(Veiculo::compareTo).orElse(null);
    }

    public void socorrerCarro(String documento){
        this.socorristaCarro.socorrer((Carro) buscarVeiculo(documento));
    }

    public void socorrerMoto(String documento){
        this.socorristaMoto.socorrer((Moto) buscarVeiculo(documento));
    }
}
