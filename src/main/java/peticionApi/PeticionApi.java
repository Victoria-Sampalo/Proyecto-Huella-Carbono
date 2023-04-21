/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peticionApi;

import apiCarbon.Api;
import conexionHTTP.ConexionHTTP;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import serviciosJson.JsonService;

/**
 *
 * @author victoria
 */
public class PeticionApi {
    String texto= ""; 
    //Método que valida la url que indica el usuario por pantalla y verifica si la url es válida o no.
    public static Api peticionDatoUrl(String UrlTexto){
        //Si está vacio o si la url no es valida
       if(!UrlTexto.isEmpty() ||urlValidador(UrlTexto)){
        
            //Igualo la url que luego saldrá por pantalla
         String  urlBase ="https://api.websitecarbon.com/site?url=" + UrlTexto;   
          //Llamo a realizar la conexion con la api 
          
             String fichero = "";
           try {   
                fichero = ConexionHTTP.peticionHttpGet(urlBase);
     
          
                Api respuesta= (Api) JsonService.stringToPojo(fichero, Api.class);
                 return respuesta;
          
        }catch(Exception e){
         return null;
        
        }
     
       }
       return null;
    }
    
      //Metodo privado que devuelve un booleano si la url está mal expresada en el textArea
private static boolean urlValidador(String url){

    try {
            new URL(url).toURI();
            return true;
        }
        catch (URISyntaxException urlse) {
            System.out.println("Esta url tiene una sintaxis incorrecta");
             JOptionPane.showMessageDialog(null, "Esta url tiene una sintaxis incorrecta");
            return false;
        }
        catch (MalformedURLException mfurle) {
            System.out.println("Esta url está formada de manera incorrecta");
            JOptionPane.showMessageDialog(null, "Esta url está formada de manera incorrecta");
            return false;
        }

}
}
