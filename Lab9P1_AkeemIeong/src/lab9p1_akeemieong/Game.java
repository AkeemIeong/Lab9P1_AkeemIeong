/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_akeemieong;
import java.util.ArrayList;
import lab9p1_akeemieong.Lab9P1_AkeemIeong;
import static lab9p1_akeemieong.Lab9P1_AkeemIeong.nextGen;


public class Game {
    int[][] punt;
    int[][] points;
    ArrayList list;
    int rounds;
    public void jugar(int rounds,int [][]list){
        int [][]finale=list;
        int conta=0;
        do{
            nextGen(finale);
            
            conta++;
        }while (conta>rounds);
    }
        public int[][] nextGen(int[][] list){
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
        return newl;
    }
    public ArrayList<String> print(ArrayList<String>list){
        int [][]points=new int[10][10];
        String blank="";
        for(int i=0;i<list.size();i++){
            blank=list.get(i);
        }
        list.clear();
        return points;
    }
    public String imprimir(int[][] matrix) {
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


