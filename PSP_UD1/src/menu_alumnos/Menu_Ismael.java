package menu_alumnos;

import java.util.Scanner;

import com.Utils;

public class Menu_Ismael {
    
    public static void main(String[] args)  throws Exception {

        Scanner sc = new Scanner(System.in);
        int res;

        do{
            System.out.println("Introduce 1 para ping www.google.com");
            System.out.println("Introduce 2 uname -a");
            System.out.println("Introduce 3 para hostnamectl");
            System.out.println("Introduce 0 para salir:");
            res = sc.nextInt();

            switch (res) {
                case 1:
                    int return_code = new ProcessBuilder(Utils.sh("ping www.google.com")).inheritIO().start().waitFor();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            
                default:
                    break;
            }



        }while(res != 0);

        /*int return_code = new ProcessBuilder(Utils.sh(String.join(" ", args))).inheritIO().start().waitFor();*/
    }

}