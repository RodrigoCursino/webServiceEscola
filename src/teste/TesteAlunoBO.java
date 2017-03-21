
package teste;

import bo.AlunoBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;

/**
 *
 * @author Rodrigo
 */
public class TesteAlunoBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            
            Aluno a = new Aluno();
            /*
            a.setCurso("TSI");
            a.setMatricula("3215-2");
            a.setTurma("3212");
            a.setFaltas(15);
            a.setNome("Luiz");
            */
            
            AlunoBO abo = new AlunoBO();
            double m = abo.media("3215-2");
            //String situacao = abo.situacao();
            String situacao = abo.faltas();
            System.out.println(m);
            System.out.println(situacao);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
