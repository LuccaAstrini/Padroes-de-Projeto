package com.mycompany.template;

import java.util.Scanner;

public class Template {

    public static void main(String[] args) {
        
        Network network = null;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input user name: ");
        String userName = scan.nextLine();
        
        System.out.println("Input password: ");
        String password = scan.nextLine();
        
        System.out.println("Input message: ");
        String message = scan.nextLine();
        
        System.out.println("\nChoose social network for postin message:\n1-Facebook\n2-Twitter");
        int choice = Integer.parseInt(scan.next());
        
        if(choice == 1){
            network = new Facebook(userName, password);
        }else if(choice == 2){
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
