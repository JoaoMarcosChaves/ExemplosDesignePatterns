/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.FactoryMethod;

/**
 *
 * @author joãomarcos
 */
public class EmissorEmail implements Emissor{
    
    public void envia ( String message ) {
    System.out.println (" Enviando por EMAIL a mensagem : ");
    System.out.println ( message );
     }

}
