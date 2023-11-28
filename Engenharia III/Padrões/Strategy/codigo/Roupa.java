public abstract class Roupa {
    private Tipo tipo;

    public abstract void escolherTipo();

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
