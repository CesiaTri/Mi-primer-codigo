package com.mycompany.piedra_papel_tijeras;

import java.util.Scanner;
import java.util.Random;
public class Piedra_papel_tijeras {
    public static void main(String[] args){
        Scanner lec=new Scanner(System.in);
        Random ale=new Random();

        System.out.println("Elije tu movimiento:");
        System.out.println("°Piedra\n°Papel\n°Tijeras");
        String res_us=lec.nextLine();
        int mov_us=num_mov(res_us);
        int mov_c=ale.nextInt(3);
        System.out.println("\nElegiste: "+movimiento(mov_us));
        System.out.println("La computadora: "+movimiento(mov_c));
        System.out.println(".\n..\n...\n"+ganador(mov_us,mov_c));
    }
    public static int num_mov(String res){
        if(res.equals("Papel") || res.equals("papel")){
            return 0;
        }else if(res.equals("Piedra") || res.equals("piedra")){
            return 1;
        }else{
            return 2;
        }
    }
    public static String movimiento(int mov){
        if(mov==0){
            return "Papel";
        }else if(mov==1){
            return "Piedra";
        }else{
            return "Tijeras";
        }
    }
    public static String ganador(int mov_us,int mov_c){
        if(mov_us==mov_c){
            return "___Es un empate___";
        }else if(mov_us==0 && mov_c==1){
            return "___Ganaste___";
        }else if(mov_us==1 && mov_c==2){
            return "___Ganaste___";
        }else if(mov_us==2 && mov_c==0){
            return "___Ganaste___";
        }else{
            return "___Perdiste___";
        }
    }
}
