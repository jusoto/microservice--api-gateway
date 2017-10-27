package org.aitesting.microservices.apigateway;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Login {

    private final Authenticator authenticator;

    public Login() {
        authenticator = Authenticator.getInstance();
    }

    public String loginPassenger(String username, String password) {
        String token = "";
        try {
            token = authenticator.checkin(username);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return token;
    }

    public void blockPassenger(String email) {
        // TODO: Send username to Passenger API to block 
    }

    public String loginDriver(String username, String password) {
        String token = "";
        try {
            token = authenticator.checkin(username);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return token;
    }

    public void blockDriver(String email) {
        // TODO: Send username to Driver API to block 
    }
}