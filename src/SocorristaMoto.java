public class SocorristaMoto implements SocorrerInterface<Moto>{
    @Override
    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto de placa " + moto.getPlaca());
    }
}
