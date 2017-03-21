/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Aluno;
import model.Nota;
import util.GerenciadorDeEntidade;

/**
 *
 * @author Rodrigo
 */
public class NotaDAO extends GenericDao<Nota>{
    
    private GerenciadorDeEntidade manager = GerenciadorDeEntidade.getInstance();
    private EntityManager em = manager.getEntityManager();
    
    public List <Nota> buscarNotas (Aluno a) throws SQLException {
        List <Nota> notasList = new LinkedList<>();
        Query query = em.createQuery("SELECT n FROM Nota n WHERE n.aluno.matricula LIKE :a");
        query.setParameter("a", a.getMatricula());
        return notasList = query.getResultList();
    }
}
