/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Server;

import java.util.Scanner;

/**
 *
 * @author andrey
 */
public class ConsoleView implements IView {
    
    public void enterCommand(){
        Scanner scanner = new Scanner(System.in);
        String command;
        
        while(true){
            System.out.println("Enter a command:");
            command = scanner.nextLine();
        }    
    }

    public static void main(String[] args) {
        ConsoleView console = new ConsoleView();
        while(true)
            console.enterCommand();
    }
}
