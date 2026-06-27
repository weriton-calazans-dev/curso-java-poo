package entities;

public class RetanguloCalculo {

    public double altura;
    public double largura;

    public RetanguloCalculo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double area(){
        return this.largura * this.altura;
    }

    public double perimetro(){
        return (this.largura * 2) + (this.altura * 2);
    }

    public double diagonal(){
        return Math.sqrt((largura * largura + altura * altura));
    }

    public String toString(){
        return "A area: " + String.format("%.2f",area()) + "\n" +
                "Perimetro total: " + String.format("%.2f",perimetro()) + "\n" +
                "Diagonal: " + String.format("%.2f",diagonal());
    }

}