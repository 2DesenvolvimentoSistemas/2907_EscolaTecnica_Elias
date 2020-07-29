/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.ComponenteCurricular;

/**
 *
 * @author Carlos
 */
public class TesteComponenteCurricular {
    public static void main(String[] args) {
        ComponenteCurricular componente = new ComponenteCurricular();
        
        componente.setSigla("bdado");
        componente.setComponente("Banco de Dados");
        componente.setCargaHoraria(1500);
        
        componente.imprimirComponente();
        
        ComponenteCurricular encapComp = new ComponenteCurricular("desis", "Desenvolvimento de Sistemas", 1500);
        encapComp.imprimirComponente();
    }
}
