/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package key;

/**
 *
 * @author David
 */
import java.util.ArrayList;
public class dependencia {
   private ArrayList<String> determinantes;
   private ArrayList<String> dependientes;
   
   public dependencia(ArrayList<String> det,ArrayList<String> dep){          
       this.determinantes = det;
       this.dependientes = dep;
   }
   public ArrayList<String> getDeterminantes(){
       return this.determinantes;
   }
   public ArrayList<String> getDependientes(){
       return this.dependientes;
   }
   public void setDeterminantes(ArrayList<String> det){
       this.determinantes = det;
   }
   public void setDependientes(ArrayList<String> dep){
       this.dependientes = dep;
   }
}
