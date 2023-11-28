public class LojaRoupa {
    private Masculina masculina;
    private Feminina feminina;
    private Unissex unissex;
    private TipoPeca tipoPeca;

    public void comprarMasculina(String roupaMasculina) {
        masculina.comprarMasculina(roupaMasculina);
    }

    public void comprarFeminina(String roupaFeminina) {
        feminina.comprarFeminina(roupaFeminina);
    }

    public void comprarUnissex(String roupaUnissex) {
        unissex.comprarUnissex(roupaUnissex);
    }

    public void escolherTipo(String tipoRoupa) {
        tipoPeca.escolherTipo(tipoRoupa);
    }
}
