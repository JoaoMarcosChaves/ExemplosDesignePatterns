/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.Multiton;

/**
 *
 * @author joãomarcos
 */
public class TestaTema {
    public static void main ( String [] args ) {
 Tema temaFire = Tema . getInstance ( Tema . WATER );
 System . out. println (" Tema " + temaFire . getNome ());
 System . out. println (" Cor Da Fonte : " + temaFire . getCorDaFonte ());
 System . out. println (" Cor Do Fundo : " + temaFire . getCorDoFundo ());

 Tema temaFire2 = Tema . getInstance ( Tema . SKY );

 System . out. println (" --------");
 System . out. println (" Comparando as referências ... ");
 System . out. println ( temaFire == temaFire2 );
 }
}
