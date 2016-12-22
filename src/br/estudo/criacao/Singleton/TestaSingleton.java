/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.Singleton;

/**
 *
 * @author joãomarcos
 */
public class TestaSingleton {
    public static void main ( String [] args ) {
 Configuracao configuracao = Configuracao . getInstance ();
 System . out. println ( configuracao . getPropriedade ("time - zone "));
 System . out. println ( configuracao . getPropriedade (" currency - code "));
 }
}
