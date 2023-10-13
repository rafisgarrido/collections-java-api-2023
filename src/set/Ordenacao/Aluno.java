package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable <Aluno> {
    //atributos
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.getMedia(), getMedia()) == 0 && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMedia());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }
}

class ComparatorNota implements Comparator<Aluno> {
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
