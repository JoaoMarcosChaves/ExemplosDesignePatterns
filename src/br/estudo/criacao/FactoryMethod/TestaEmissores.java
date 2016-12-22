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

/*

Objetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado
tipo.
São geradas instancias de objetos através da classe EmissorCreator. Quando passamos uma opção que para o método create da classe, ele retorna o objeto
que necessitamos automáticamente.

*/
public class TestaEmissores {
    public static void main(String[] args) {

        EmissorCreator creator = new EmissorCreator();
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia ("K19 Treinamentos sms ");

       Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
       emissor2 . envia ("K19 Treinamentos email");

       Emissor emissor3 = creator.create(EmissorCreator.JMS);
       emissor3 . envia ("K19 Treinamentos jms");
       
       
       
       
 }
    
}
