public class Vestido implements Roupa {
    private int tamanho;
    private String modelo;
    private double valor;

    @Override
    public void escolherTipo() {
        System.out.println("Tipo: Vestido");
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValor() {
        return valor;
    }
}
