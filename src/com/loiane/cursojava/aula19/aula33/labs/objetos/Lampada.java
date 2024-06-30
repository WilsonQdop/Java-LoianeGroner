package com.loiane.cursojava.aula19.aula33.labs.objetos;

public class Lampada {

    // Atributos
    private String modelo;
    private String  tensao;
    private String cor;
    private String tipoLuz;
    private int potenciaWalts;
    private int garantiaMeses;
    private boolean ligado;
    private String[] tipos = {"Abajur", "Luminaria", "Pendentes"};

    // Construtores
    public Lampada(String modelo, String tensao, String cor, String tipoLuz, int potenciaWalts, int garantiaMeses, boolean ligado, String[] tipos) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.potenciaWalts = potenciaWalts;
        this.garantiaMeses = garantiaMeses;
        this.ligado = ligado;
        this.tipos = tipos;
    }
    public Lampada() { }

    // Métodos Getters e Setters
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int getPotenciaWalts() {
        return potenciaWalts;
    }

    public void setPotenciaWalts(int potenciaWalts) {
        this.potenciaWalts = potenciaWalts;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    // Métodos
    public void ligado() {
        setLigado(true);

    }
    public void desligado() {
        setLigado(false);
    }
    public void mostrarEstados() {
        if(isLigado()) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
    public void mudarEstado() {
        if(isLigado()) {
            desligado();
        } else {
            ligado();
        }
    }
}
