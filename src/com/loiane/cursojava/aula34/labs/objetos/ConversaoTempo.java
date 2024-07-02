package com.loiane.cursojava.aula34.labs.objetos;

public class ConversaoTempo {
    public static double minutoParaSegundo(double minutos) {
        final int SEGUNDOS = 60;
        return minutos * SEGUNDOS;
    }
    public static double horaParaMinutos(double horas) {
        final int MINUTOS = 60;
        return horas * MINUTOS;
    }
    public static double minutosParaHoras(double minutos) {
        final int horas = 60;
        return minutos / horas;
    }
    public static double diasParaHoras(int dia) {
        return dia * 24;
    }
    public static double diasParaSemanas(int semana) {
        return semana * 7;
    }
    public static double DiasParaMeses(int mes) {
        return mes * 30;
    }
    public static double diasParaAnos(double ano) {
        return ano * 365.25;
    }
}
