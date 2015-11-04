package ro.iasinschi.views;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * File LoginView.java
 * TODO: Document me
 * <p/>
 * Created by Adrian Iasinschi (aiasinschi@gmail.com) on 11/3/2015 6:48 PM.
 */
@ManagedBean
@ViewScoped
public class LoginView {
    private static Log LOG = LogFactory.getLog(LoginView.class);

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void doLogin(){
        LOG.debug(username);
        LOG.debug(password);
    }
}
