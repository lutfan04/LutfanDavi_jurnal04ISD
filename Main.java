package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<ListPlayer> playerList = new LinkedList<ListPlayer>();

        Scanner input = new Scanner(System.in);

        boolean keluaran = true;
        while (keluaran) {
            pilihan();
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Masukkan judul lagu :");
                    String judulLagu = input.next();
                    System.out.println("Masukkan nama penyanyi :");
                    String namaPenyanyi = input.next();
                    playerList.addLast(new ListPlayer(judulLagu, namaPenyanyi));
                    break;

                case 2:
                    System.out.println("1.Hapus lagu terakhir");
                    System.out.println("2.Hapus berdasarkan judul");
                    if (input.nextInt() == 1) {
                        playerList.removeLast();
                    } else {
                         removeWithJudul(playerList, input.next());
                    }
                    break;

                case 3:
                    print(playerList);
                    System.out.println();
                    break;

                default:
                    keluaran = false;
                    break;
            }
        }
    }

    private static void removeWithJudul(LinkedList<ListPlayer> playerList, String remove) {
        playerList.remove (0);
    }

    public static void pilihan() {
        System.out.println("pilih menu :");
        System.out.println("1.Input lagu");
        System.out.println("2.Delete lagu");
        System.out.println("3.Play");
        System.out.println("4.out");
    }

    public static void print(LinkedList playerLists) {
        ListIterator<Object> iterator = playerLists.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" | ");
            }
        }
    }
}
