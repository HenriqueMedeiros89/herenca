package heranca;

public class Heranca {

    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();

        carro.setNumPlaca("GTO-5996");
        carro.setNumPortas(3);
        carro.setCapacidade(5);
        carro.setNumRodas(4);
        
        carro.ImprimeDadosCarro();
        
        moto.setNumPlaca("MEU-5968");
        moto.setNumPortas(0);
        moto.setNumRodas(2);
        moto.setCapacidade(2);
        
        moto.ImprimeDadosMoto();
    }

}
