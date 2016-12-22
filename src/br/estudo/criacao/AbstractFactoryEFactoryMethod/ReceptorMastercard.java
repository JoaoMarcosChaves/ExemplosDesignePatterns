/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.AbstractFactoryEFactoryMethod;

/**
 *
 * @author joãomarcos
 */
public  class ReceptorMastercard implements Receptor{
    
public String recebe () {
 System . out. println (" Recebendo mensagem da Mastercard .");
 String mensagem = " Mensagem da Mastercard ";
 return mensagem ;
 }    

    
}
