package key;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class campo {
   private String campo;
   private boolean revisado;
   
   public campo(String nombre){
       campo = nombre;
       revisado = false;            
   }
   public String getNombre(){
       return campo;
   }
   public boolean getRevisado(){
       return revisado;
   }
   public void setNombre(String nombre){
       campo = nombre;
   }
   public void setRevisado(boolean value){
       revisado = value;
   }
}
