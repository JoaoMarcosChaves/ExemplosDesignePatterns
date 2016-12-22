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
 */
public class TestaGeradorDeBoleto {
 public static void main ( String [] args ) {
 
     BoletoBuilder boletoBuilder = new BBBoletoBuilder ();/*Informa que a interface boletoBuilder receberá informações de campos encapsulados
     de BBBoletoBuilder */
     
     boletoBuilder.buildCedente("Cedente");
     boletoBuilder.buildNossoNumero(1948);
     boletoBuilder.buildSacado("Jones");
     boletoBuilder.buildValor(300);
     Calendar vencimento = Calendar . getInstance ();
     vencimento . add( Calendar .DATE , 30) ;
     boletoBuilder.buildVencimento(vencimento);
     
     
     GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto ( boletoBuilder ); /* Aqui ele agrega o valor do objeto da classe encapsulada,
     ao construtor publico declarado na classe GeradorDeBoleto, para que uma variavel lá declarada, passe a referenciar a classe emcapsulada, que representa a interface*/
     Boleto boleto = geradorDeBoleto . geraBoleto (); /*Cria um objeto da interface boleto que vai obter um retorno do método gerar boleto,
     que formula o conteudo de todos os campos que compõe a iterface Boleto, dando assim a forma final do conteudo.*/
     System . out. println ( boleto );
    
 }
 
}
