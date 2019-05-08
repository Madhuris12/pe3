package com.stackroute;

public class ChessBoard {
    public static void main(String[] args)
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.println();
            for (int j = 0; j < 4; j++)
            {
                if(i%2==0) {
                    System.out.print("ww" + "|" + "bb" + "|");
                }
                else
                    {
                    System.out.print("bb" + "|" + "ww" + "|");
                }
            }
        }
    }
}

