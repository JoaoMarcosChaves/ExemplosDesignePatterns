/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.builder;

import java.util.Calendar;

/**
 *
 * @author joãomarcos
 * 
 * Esta interface define os objetos que serão construidos pelos builders
 */
public interface Boleto {
    
 String getSacado ();
 String getCedente ();
 double getValor ();
 Calendar getVencimento ();
 int getNossoNumero ();
 //String toString ();
}
