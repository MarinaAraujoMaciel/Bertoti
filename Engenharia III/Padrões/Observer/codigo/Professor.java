public class Professor implements Observer {
    @Override
    public void registrar(String nome, int matricula) {
        System.out.println("Registro do professor - Nome: " + nome + ", Matrícula: " + matricula);
    }
}
