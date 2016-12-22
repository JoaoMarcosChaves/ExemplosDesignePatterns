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
public class ReceptorCreator {
public static final int VISA = 0;
 public static final int MASTERCARD = 1;

 public Receptor create ( int tipoDoReceptor ) {
 if( tipoDoReceptor == ReceptorCreator . VISA ) {
 return new ReceptorVisa ();
 } else if ( tipoDoReceptor == ReceptorCreator . MASTERCARD ) {
 return new ReceptorMastercard ();
 } else {
 throw new IllegalArgumentException (" Tipo de receptor não suportado .");
 }
 }    
}
