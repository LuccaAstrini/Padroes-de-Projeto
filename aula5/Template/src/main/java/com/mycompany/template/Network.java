package com.mycompany.template;

public abstract class Network {
    
    protected String userName;
    protected String password;
    
    public final boolean post(String message){
        if(logIn(this.userName, this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }
    
    public abstract boolean logIn(String userName, String password);
    public abstract boolean sendData(byte data[]);
    public abstract void logOut();
}
