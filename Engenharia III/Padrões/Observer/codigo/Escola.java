public class Escola implements Observer {
    @Override
    public void registrar(String nome, int matricula) {
        System.out.println("Registro na escola - Nome: " + nome + ", Matrícula: " + matricula);
    }
}
