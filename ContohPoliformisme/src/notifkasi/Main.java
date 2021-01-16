/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifkasi;

/**
 *
 * @author ElpamaZ
 */
public class Main {
    
    public static void main(String[] args){
        String emailPenerima = "bintangraihan192@gmail.com " ;
        String nomerHp = " 081231882122 " ;
        String mobileId = "android-696969 " ;
        
        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotifikasi smsNotif = new SMSNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();
        
        String message = "Hello World";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
    
}
