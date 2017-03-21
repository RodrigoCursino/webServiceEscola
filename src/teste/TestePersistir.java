/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.AlunoDao;
import dao.NotaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import model.Aluno;
import model.Nota;
import util.GerenciadorDeEntidade;

/**
 *
 * @author Rodrigo
 */
public class TestePersistir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Aluno a = new Aluno();
       a.setNome("Pedro");
       a.setCurso("TSI");
       a.setTurma("3212");
       AlunoDao adao = new AlunoDao();
       NotaDAO ndao = new NotaDAO();
       List <Nota> n = new ArrayList<>();
       
       
        try {
            a = adao.buscaPorId(Aluno.class, 3L);
            n = ndao.buscarNotas(a);
            //ndao.persistir(n);
            System.out.println(a.getNome());
        } catch (SQLException ex) {
            Logger.getLogger(TestePersistir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
