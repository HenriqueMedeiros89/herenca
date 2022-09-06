package heranca;

public class Automovel extends Terrestre {

    private String numPlaca;
    private int numPortas;

    public void ImprimeDadosCarro() {
        System.out.println("Placa: " + numPlaca);
        System.out.println("N° Portas: " + numPortas);
        System.out.println("N° de Rodas: " + numRodas);
        System.out.println("Capacidade: " + capacidade);
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
