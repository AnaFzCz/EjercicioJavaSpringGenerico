package br.alura.alura.ejercicioJavaSpringGenerico;

import java.util.List;

public class Evaluacion<T> {
    private T item;
    private double nota;
    private String comentario;

    public Evaluacion(T item, double nota, String comentario) {
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe ser calificada entre 1 a 10");
        }
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static <T> double mediaNota(List<Evaluacion<T>> evaluaciones) {
        if (evaluaciones.isEmpty()) {
            System.out.println("La lista de evaluaciones está vacia");
        }
        double suma = 0;
        for (Evaluacion<T> evaluacion : evaluaciones) {
            suma = suma + evaluacion.getNota();

        }
        return suma / evaluaciones.size();
    }


    @Override
    public String toString() {
        return "Evaluacion{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
