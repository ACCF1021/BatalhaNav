package com.Educational;

public class Tabuleiros {
    static int Y1 = 9;
    static int X1 = 9;
    static int Y2 = 36;
    static int X2 = 36;
    static int Y3 = 48;
    static int X3 = 48;




    public void Tabuleiro2player(ConstNavio Navio) {
        int[][] tabuleiro = new int[X1][Y1];

        for(int c=0; c < X1; c++) {
            for(int l=0; l < Y1; l++) {
                if(c == Navio.proa.posX && l == Navio.proa.posY || c == Navio.conves.posX && l == Navio.conves.posY || c == Navio.popa.posX && l == Navio.popa.posY) {
                    System.out.printf("x");
                } else {
                    System.out.printf("o");
                }


            }
            System.out.println("");
        }
    }

    public void Tabuleiro3player() {
        int[][] tabuleiro = new int[X2][Y2];

        for(int c=0; c < X2; c++) {
            for(int l=0; l < Y2; l++) {

            }
            System.out.println("");
        }
    }


    public void Tabuleiro4player() {

        int[][] tabuleiro = new int[X3][Y3];

        for(int c=0; c < X3; c++) {
            for(int l=0; l < Y3; l++) {



            }
            System.out.println("");
        }
    }
}
