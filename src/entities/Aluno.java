package entities;

public class Aluno {
    public String aluno;
    public double nota1;
    public double nota2;
    public double nota3;

    public Aluno(String aluno, double nota1, double nota2, double nota3){
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double somaNota(){
        return nota1 + nota2 + nota3;
    }
    public double quantofalta(){
        if (somaNota() > 60.00){
            return 60.00 - somaNota();
        } else {
            return 0.0;
        }
    }

}