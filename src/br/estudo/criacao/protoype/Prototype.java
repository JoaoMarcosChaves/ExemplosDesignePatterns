/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estudo.criacao.protoype;

/**
 *
 * @author joãomarcos
 * 
 * Abstração dos objetos que possuem a capacidade de se auto copiar.
 */
public interface Prototype<t> {
    t clone();
}
