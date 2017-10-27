package org.aitesting.microservices.apigateway;

import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Logout {
    
    private final Authenticator authenticator;

    public Logout() {
        authenticator = Authenticator.getInstance();
    }
    
    public boolean logout(String username, String token){
         try {
             authenticator.checkout(username, token);
             return true;
         } catch (GeneralSecurityException ex) {
             Logger.getLogger(Logout.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
    
}
