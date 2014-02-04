/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import net.sf.oval.constraint.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author juan
 */
@Entity
public class Twoot extends Model{
    @Required
    @MaxSize(141)
    public String mensaje;
    @Required
    public Date fechaCreacion;

    public Twoot(String mensaje) {
        this.mensaje = mensaje;
        this.fechaCreacion = new Date();
    }

   public static List<Twoot> traemeLosUltimos(){
  return  Twoot.find("order by fechaCreacion desc").fetch();
   }
    @Override
    public String toString() {
        return mensaje;
    }
    
    
}
