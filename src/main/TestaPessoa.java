/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import escola.Pessoa;
        
public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Carla", "Zero, Chocolate, nº007", "99997070");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());        
    }
    
}
