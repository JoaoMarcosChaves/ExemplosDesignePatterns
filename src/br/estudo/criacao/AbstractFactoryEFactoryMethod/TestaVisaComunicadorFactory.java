/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.AbstractFactoryEFactoryMethod;

import java.util.Scanner;

/**
 *
 * @author joãomarcos
 */

/*

Objetivo: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de
diversas famílias.


*/
public class TestaVisaComunicadorFactory {
 
    public static void main(String[] args) {

        int op = 0;
        System.out.println("Qual forma de pagamento deseja utilizar?");
        System.out.println("1 - Visa\n");
        System.out.println("2 - Mastercard\n\n");
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        
        switch(op){
            
            case 1:
                
                ComunicadorFactory comunicadorFactoryV = new VisaComunicadorFactory ();

                System.out.println("Digite o valor: ");
                String valor  = sc.next();
                System.out.println("Digite a senha: ");
                String senha  = sc.next();
                
                String transacao = " Valor = "+valor +" Senha = "+senha;
                Emissor emissor = comunicadorFactoryV.createEmissor();
                emissor . envia ( transacao );

                Receptor receptor = comunicadorFactoryV . createReceptor ();
                String mensagem = receptor . recebe ();
                System . out. println ( mensagem );
                
                break;
            
            case 2: 
                ComunicadorFactory comunicadorFactoryM = new MastercardComunicadorFactory();
                
                System.out.println("Digite o valor: ");
                String valorM  = sc.next();
                System.out.println("Digite a senha: ");
                String senhaM  = sc.next();
 
                String transacaoM = " Valor = "+valorM +" Senha = "+senhaM;
                Emissor emissorM = comunicadorFactoryM.createEmissor();
                emissorM.envia(transacaoM);
 
                Receptor receptorM = comunicadorFactoryM.createReceptor();
                String mensagemM = receptorM.recebe();
                System.out.println(mensagemM);
                
                
                break;
        }
        
    }
}
