import java.util.List;

public class View implements Observer {
    private Tipo tipo;
    private List<Roupa> roupa;

    public void setRoupa(Roupa r) {
        this.roupa.add(r);
        System.out.println("Roupa adicionada à View!");
    }

    @Override
    public void update(List<Roupa> roupas) {
        System.out.println("View atualizada com novas roupas!");
    }
}
