public class Calça implements Roupa {
    private int tamanho;
    private String modelo;
    private double valor;

    @Override
    public void escolherTipo() {
        System.out.println("Tipo: Calça");
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
