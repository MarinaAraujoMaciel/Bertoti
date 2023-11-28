public class Vestido implements Tipo {
    private View v;
    private LojaRoupas lojaRoupas;

    @Override
    public void escolherTipo() {
        System.out.println("Tipo: Vestido");
    }

    public void setV(View view) {
        this.v = view;
    }
}
