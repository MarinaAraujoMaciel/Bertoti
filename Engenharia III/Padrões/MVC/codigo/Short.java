public class Short implements Tipo {
    private View v;
    private LojaRoupas lojaRoupas;

    @Override
    public void escolherTipo() {
        System.out.println("Tipo: Short");
    }

    public void setV(View view) {
        this.v = view;
    }
}
