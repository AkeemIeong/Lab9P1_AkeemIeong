package lab9p1_akeemieong;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lab9P1_AkeemIeong {
    static Random random=new Random();
    static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
        Game g=new Game();
        int opcion;
        do{
            System.out.println("1<-Game of life\n2<-salida\nIngrese la opcion: ");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    int rounds;
                    System.out.println("Ingrese el numero de rondas: ");
                    rounds=leer.nextInt();
                    int lineas=10;
                    int columnas=10;
                    int[][]lista=punt(lineas,columnas);
                    jugar(rounds,lista);
                    
                    break;
                
            }
        }while (opcion!=2);
    }
    public static void jugar(int rounds,int [][]list){
        int [][]finale=list;
        int conta=0;
        do{
            nextGen(finale);
            
            conta++;
        }while (conta>rounds);
    }
            
    public static int[][] punt(int lineas,int columnas) {
        int[][] temporal = new int[lineas][columnas];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < columnas; j++) {
                temporal[i][j] = random.nextInt(2);
                if (i==0&&j>=0){
                    temporal[i][j]=0;
                }else
                if (i>0&&j==0){
                    temporal[i][j]=0;
                }else
                if (i==temporal.length-1&&j>0){
                    temporal[i][j]=0;
                }else
                if (i>0&&j==temporal.length-1){
                    temporal[i][j]=0;
                }
                if(temporal[i][j]==1){
                    String temp = String.format("%d:%d", i, j);
                    list.add(temp);
                    
                }
                
            }
        }
        System.out.println(list);
        System.out.println(imprimir (temporal));
        return temporal;
    }
    
    public static int[][] nextGen(int[][] list){
        ArrayList<String>tempo=new ArrayList<>();
        int[][]newl=list;
        int vecinos=0;
            for (int i=0;i<list.length;i++){
                for (int j=0;j<list[i].length;j++){
                    if (i==0&&j>=0||i>0&&j==0 ||i==list.length-1&&j>0 ||i>0&&j==list.length-1){
                        String temp ="";
                    }
                    else
                        if (list[i-1][j-1]==1){
                        vecinos++;
                        }else
                   
                        if (list[i-1][j]==1){
                        vecinos++;
                        }else
                    
                        if (list[i-1][j+1]==1){
                            vecinos++;
                        }else
                    
                        if (list[i][j-1]==1){
                            vecinos++;
                        }else
                    
                        if (list[i][j+1]==1){
                            vecinos++;
                        }else
                    
                        if (list[i+1][j-1]==1){
                            vecinos++;
                        }else
                    
                        if (list[i+1][j]==1){
                            vecinos++;
                        }
                    
                        if (vecinos==3||vecinos==2){
                            newl[i][j]=1;
                            String temp = String.format("%d:%d", i, j);
                            tempo.add(temp);
                        }
                }
            }
            
        //System.out.println(imprimir(newl));
        System.out.println(tempo);
        print(tempo);
        return newl;
    }
    
    public static ArrayList<String> print(ArrayList<String>list){
        int [][]points=new int[10][10];
        String blank="";
        for(int i=0;i<list.size();i++){
            blank=list.get(i);
        }
        list.clear();
        return points;
    }
    public static String imprimir(int[][] matrix) {
        String cadena = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                cadena += "[" + matrix[i][j] + "]" + " ";
            }
            cadena += "\n";
        }

        return cadena;
    }


   
    

}
