public class Camisa extends Roupa {
    private String cor;
    private String uso;
    private boolean estampada;
    private String marca;

    public Camisa(String cor, String uso, boolean estampada, String marca) {
        this.cor = cor;
        this.uso = uso;
        this.estampada = estampada;
        this.marca = marca;
    }

    @Override
    public void escolherTipo() {
        System.out.println("Camisa escolhida.");
        System.out.println("Detalhes: Cor - " + cor + ", Uso - " + uso + ", Estampada - " + estampada + ", Marca - " + marca);
    }
}
