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
 * Interface que define os passos para a criação de um produto. Ou seja, os metodos construtores do classe que implementa a interface produto.
 */
public interface BoletoBuilder {
 void buildSacado ( String sacado );
 void buildCedente ( String cedente );
 void buildValor ( double valor );
 void buildVencimento ( Calendar vencimento );
 void buildNossoNumero ( int nossoNumero );

 Boleto getBoleto ();
}
