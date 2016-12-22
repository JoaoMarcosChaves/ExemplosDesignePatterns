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
public class ReceptorVisa implements Receptor{
    
public String recebe () {
 System . out. println (" Recebendo mensagem da Visa .");
 String mensagem = " Mensagem da Visa ";
 return mensagem ;
 }    
}
