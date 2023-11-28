import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Observer> observers = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void registro() {
        for (Observer observer : observers) {
            observer.registrar(nome, matricula);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}