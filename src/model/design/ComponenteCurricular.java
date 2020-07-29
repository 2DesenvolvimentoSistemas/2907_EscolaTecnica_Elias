/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author Carlos
 */
public class ComponenteCurricular {
    private String sigla;
    private String componente;
    private double cargaHoraria;
    
    public void imprimirComponente(){
        System.out.println("Sigla: " + getSigla());
        System.out.println("Componente: " + getComponente());
        System.out.println("Carga horária: " + getCargaHoraria() + " horas");
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the componente
     */
    public String getComponente() {
        return componente;
    }

    /**
     * @param componente the componente to set
     */
    public void setComponente(String componente) {
        this.componente = componente;
    }

    /**
     * @return the cargaHoraria
     */
    public double getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ComponenteCurricular(String sigla, String componente, double cargaHoraria) {
        this.sigla = sigla;
        this.componente = componente;
        this.cargaHoraria = cargaHoraria;
    }

    public ComponenteCurricular() {
    }
    
    
}
