package com.loiane.cursojava.aula19.aula33.labs.objetos;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] nomesCadeiras;
    private double[][] notas;

    public Aluno() {
        nomesCadeiras = new String[3];
        notas = new double[3][2];
    }
    public Aluno (String nome, String curso, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomesCadeiras = new String[3];
        this.notas = new double[3][2];
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getNomesCadeiras() {
        return nomesCadeiras;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas() {
        this.notas = notas;
    }

    public void setNomesCadeiras(String[] nomesCadeiras) {
        this.nomesCadeiras = nomesCadeiras;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean resultadoEscolar(int indice) {
        double soma = 0;
        for(int i = 0; i < getNotas()[indice].length; i++) {
            soma += getNotas()[indice][i];
        }
        if(media(indice) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public double media(int indice) {
        double soma = 0;
        for(int i = 0; i < getNotas()[indice].length; i++) {
            soma += getNotas()[indice][i];
        }
        double media = soma / 2;
        return media;
    }
    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());

        for (int i = 0; i < getNotas().length; i++) {
            System.out.println("Notas da disciplina " + getNomesCadeiras()[i]);
            for (int j = 0; j < getNotas()[i].length; j++) {
                System.out.print(getNotas()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
