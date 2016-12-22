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
 * Constrói umproduto específico implementando a interface Builder.
 */
public class BBBoletoBuilder implements BoletoBuilder{
 private String sacado ;
 private String cedente ;
 private double valor ;
 private Calendar vencimento ;
 private int nossoNumero ;

 
 public void buildSacado ( String sacado ) {
 this . sacado = sacado ;
 }

 public void buildCedente ( String cedente ) {
 this . cedente = cedente ;
 }

 public void buildValor ( double valor ) {
 this . valor = valor ;
 }

 public void buildVencimento ( Calendar vencimento ) {
 this . vencimento = vencimento ;
 }

 public void buildNossoNumero ( int nossoNumero ) {
 this . nossoNumero = nossoNumero ;
 }

 public Boleto getBoleto () {
 return new BBBoleto ( sacado , cedente , valor , vencimento , nossoNumero );
 }
}
