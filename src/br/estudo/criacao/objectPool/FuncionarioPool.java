/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.objectPool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joãomarcos
 */
public class FuncionarioPool implements Pool<Funcionario>{
    
    private List < Funcionario > funcionarios ;

 public FuncionarioPool () {
 this . funcionarios = new ArrayList < Funcionario >() ;
 this . funcionarios .add ( new Funcionario (" Marcelo Martins "));
 this . funcionarios .add ( new Funcionario (" Rafael Cosentino "));
 this . funcionarios .add ( new Funcionario (" Jonas Hirata "));

 }

 public Funcionario acquire () {
 if( this . funcionarios . size () > 0) {
 return this . funcionarios . remove (0) ;
 }
 else {
 return null ;
 }
 }

 public void release ( Funcionario funcionario ) {
 this . funcionarios . add( funcionario );
 }
}
