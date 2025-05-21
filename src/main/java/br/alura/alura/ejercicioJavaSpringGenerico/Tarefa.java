package br.alura.alura.ejercicioJavaSpringGenerico;

public class Tarefa {
    private String descripcion;
    private boolean concluida;
    private String personaResponsable;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPersonaResponsable() {
        return personaResponsable;
    }

    public void setPersonaResponsable(String personaResponsable) {
        this.personaResponsable = personaResponsable;
    }

    @Override
    public String toString() {
        return "Descripción: " + this.descripcion + ", " + "Concluido: " + this.concluida + ", " + " Persona Responsable: " + this.personaResponsable + " ";
    }
}
