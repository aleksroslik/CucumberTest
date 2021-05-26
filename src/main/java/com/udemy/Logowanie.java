package com.udemy;

public class Logowanie {

    private String currentUsername;
    private String currentPassword;
    private String msg;
    private boolean isLoggedin;

    public void setUserInDatabase(String username, String password)
    {
        this.currentUsername = username;
        this.currentPassword = password;
    }

    public void logIn (String username, String password)
    {
        if(username.equals(currentUsername) && password.equals(currentPassword))
        {
            this.msg = "Udało Ci się zalogować";
            this.isLoggedin = true;
        } else {
            this.msg = "Nie udało ci się zalogować";
            this.isLoggedin = false;
        }

    }

    public String getMsg()
    {
        return msg;
    }
    public boolean isLoggedin()
    {
        return isLoggedin;
    }

    public String getCurrentUsername()
    {
        return currentUsername;
    }
    public String getCurrentPassword()
    {
        return currentPassword;
    }
}
