public class SocorristaCarro implements SocorrerInterface<Carro>{
    @Override
    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro de placa " + carro.getPlaca());
    }
}
