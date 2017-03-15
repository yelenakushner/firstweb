package lv.ctco.javaschool;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yelena.krasnakova on 3/14/2017.
 */
public class User {
    private String userName;
    private String lastName;
    private String phoneNumber;
    private HttpServletRequest request;

    public User(HttpServletRequest request) {
        this.request = request;
        this.setUserName();
        this.setLastName();
        this.setPhoneNumber();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        this.userName = this.request.getParameter("userName");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = this.request.getParameter("lastName");
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber() {
        this.phoneNumber = this.request.getParameter("phoneNumber");
    }

    public HttpServletRequest getRequestData() {
        return this.request;
    }

}
