/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.Multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joãomarcos
 */
public class Tema {
    private String nome ;
 private Color corDoFundo ;
 private Color corDaFonte ;

 private static Map <String , Tema > temas = new HashMap < String , Tema >() ;

public static final String SKY = " Sky ";
public static final String FIRE = " Fire ";
public static final String WATER = " Water ";

 static {
 Tema tema1 = new Tema ();
 tema1 . setNome ( Tema .SKY );
 tema1 . setCorDoFundo ( Color . BLUE );
 tema1 . setCorDaFonte ( Color . BLACK );

 Tema tema2 = new Tema ();
 tema2 . setNome ( Tema . FIRE );
 tema2 . setCorDoFundo ( Color . RED);
 tema2 . setCorDaFonte ( Color . WHITE );
 
 Tema tema3 = new Tema ();
 tema3 . setNome ( Tema . WATER );
 tema3 . setCorDoFundo ( Color . DARK_GRAY);
 tema3 . setCorDaFonte ( Color . WHITE );

 temas .put ( tema1 . getNome () , tema1 );
 temas .put ( tema2 . getNome () , tema2 );
 temas .put ( tema3 . getNome () , tema3 );
 }

 private Tema () {
 }

 public static Tema getInstance ( String nomeDoTema ) {
 return Tema . temas .get ( nomeDoTema );
 }

 public String getNome () {
 return nome ;
 }

 public void setNome ( String nome ) {
 this . nome = nome ;
 }

 public Color getCorDoFundo () {
 return corDoFundo ;
 }

 public void setCorDoFundo ( Color corDoFundo ) {
 this . corDoFundo = corDoFundo ;
 }

 public Color getCorDaFonte () {
 return corDaFonte ;
 }

 public void setCorDaFonte ( Color corDaFonte ) {
 this . corDaFonte = corDaFonte ;
 }
}
