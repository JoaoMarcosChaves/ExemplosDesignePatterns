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
public class EmissorMastercard implements Emissor{
 public void envia ( String mensagem ) {
 System . out. println (" Enviando a seguinte mensagem para a Mastercard :");
 System . out. println ( mensagem );
 }
}
