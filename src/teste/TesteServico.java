/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import view.Servico;

/**
 *
 * @author Rodrigo
 */
public class TesteServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servico servico = new Servico();
        String situacao = servico.matricula("3215-2");
        System.out.println(situacao);
    }
    
}
