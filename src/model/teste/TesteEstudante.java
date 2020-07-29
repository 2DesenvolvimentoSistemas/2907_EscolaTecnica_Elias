/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Estudante;

/**
 *
 * @author Carlos
 */
public class TesteEstudante {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        
        est.setRm("12345");
        est.setNome("Jubiscleiton");
        
        est.apresentarEstudante();
        
        Estudante outroEst = new Estudante("23456", "Natasha Caldeirão");
        
        outroEst.apresentarEstudante();
    }
}
