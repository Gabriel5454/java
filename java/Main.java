
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Usuário digita o tipo de ingresso
        System.out.println("Escolha o tipo de ingresso:");
        System.out.println("1 - Normal");
        System.out.println("2 - VIP");

        //Atribui para a variável numero
        int numero = scanner.nextInt();

        //Cria o objeto n1
        Ingresso n1 = new Ingresso(numero);

        if (n1.tipo_ingresso == 1) {
            System.out.println("ingresso normal");

        } else {
             System.out.println("ingresso Vip!");
             
               System.out.println("Escolha o tipo do camarote:");
            System.out.println("1 - Inferior");
            System.out.println("2 - Superior");
            
            
            
            Camarote n2 = new Camarote(numero);
            
            n2.tipo_camarote = scanner.nextInt(); 
            
           if  (n2.tipo_camarote == 1) {
                System.out.println("O camarote é Inferior");
            } 
             else{
                if(n2.tipo_camarote == 2) {
                System.out.println("O camarote é Superior");
            }
            else{
                System.out.println("Numero invalido,digite 1 ou 2");
            }
            }
        }
     
    }
            
}
