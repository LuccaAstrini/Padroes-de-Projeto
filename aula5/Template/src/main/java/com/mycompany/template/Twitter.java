package com.mycompany.template;

public class Twitter extends Network{

    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters.");
        System.out.println("Nmae: " + this.userName);
        System.out.println("Password ");

        for (int i = 0; i < this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogin sucess on Twitter.");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;

        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " was posted on Twitter.");
            return true;
        }
        return false;
    }

    @Override
    public void logOut() {
        System.out.println("User: " + userName + " was logged out from Twitter.");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
