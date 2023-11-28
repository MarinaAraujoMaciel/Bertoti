import java.util.ArrayList;
import java.util.List;

public class LojaRoupas {
    private List<Roupa> roupas = new ArrayList<>();

    public void escolherTipo() {
        for (Roupa roupa : roupas) {
            roupa.escolherTipo();
        }
    }

    public void addRoupa(Roupa roupa) {
        roupas.add(roupa);
    }

    public List<Roupa> getRoupas() {
        return roupas;
    }

    public double getTotalValor() {
        double total = 0;
        for (Roupa roupa : roupas) {
            total += roupa.getValor();
        }
        return total;
    }
}
