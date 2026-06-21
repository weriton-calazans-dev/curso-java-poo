package util;

public class ConversorMoeda {
    public static final double IOF = 0.06;

    public static double dolarParaReal(double montante, double contacaoDolar){
        double valorSemImposto = montante * contacaoDolar;
        return valorSemImposto + (valorSemImposto * IOF);
    }
}
