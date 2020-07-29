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
public class Estudante {
    private String rm;
    private String nome;
    
    public void apresentarEstudante(){
        System.out.println("RM: " + getRm());
        System.out.println("Nome: " + getNome());
    }

    /**
     * @return the rm
     */
    public String getRm() {
        return rm;
    }

    /**
     * @param rm the rm to set
     */
    public void setRm(String rm) {
        this.rm = rm;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estudante(String rm, String nome) {
        this.rm = rm;
        this.nome = nome;
    }

    public Estudante() {
    }
}
