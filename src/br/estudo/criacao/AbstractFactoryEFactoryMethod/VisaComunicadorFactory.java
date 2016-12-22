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
public class VisaComunicadorFactory implements ComunicadorFactory{
 
 private EmissorCreator emissorCreator = new EmissorCreator ();
 private ReceptorCreator receptorCreator = new ReceptorCreator ();

 public Emissor createEmissor () {
 return emissorCreator . create ( EmissorCreator . VISA );
 }

 public Receptor createReceptor () {
 return receptorCreator . create ( ReceptorCreator . VISA );
 }
 
}
