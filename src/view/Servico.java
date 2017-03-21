/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.AlunoBO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Rodrigo
 */
@WebService
public class Servico {
    @WebMethod
    public String matricula (@WebParam(name="matricula") String matricula){
        try {
            AlunoBO abo = new AlunoBO();
            abo.media(matricula);
            matricula = abo.faltas();
        } catch (SQLException ex) {
            matricula = ex.getMessage();
        } catch (NullPointerException ex) {
            matricula = ex.getMessage();
        }
       return matricula;
    }
}
