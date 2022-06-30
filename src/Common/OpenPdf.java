/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author sumee
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("E:\\"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null,"File is not Exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
