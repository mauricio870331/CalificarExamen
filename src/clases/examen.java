package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio Herrera
 */
public class examen {
    private String vectorPreguntas[];
    private String vectorRespuestas[];
    private double nota;
    private int correctas;
    private int totalPreguntas;



    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }
    
    public void llenarPreguntas(){
      this.vectorRespuestas = new String[totalPreguntas];
      
    }

    public int getTotalPreguntas() {
        return totalPreguntas;
    }

    public void setTotalPreguntas(int totalPreguntas) {
        this.totalPreguntas = totalPreguntas;
    }

    public String[] getVectorPreguntas() {
        return vectorPreguntas;
    }

    public void setVectorPreguntas(String[] vectorPreguntas) {
        this.vectorPreguntas = vectorPreguntas;
    }

    public String[] getVectorRespuestas() {
        return vectorRespuestas;
    }

    public void setVectorRespuestas(String[] vectorRespuestas) {
        this.vectorRespuestas = vectorRespuestas;
    }
    
}
