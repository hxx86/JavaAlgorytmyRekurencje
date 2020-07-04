package chess;

import java.util.Scanner;

public class ChessBoard {

    // co klasa ma
    private static char[][] chessBoard; // macierz n x n ze znakami szachownicy
    private static char whiteField = 'W'; // znak dla pola białego
    private static char blackField = 'B';  // znak dla pola czarnego
    // metody klasy
    // z automatu
    public ChessBoard(char[][] chessBoard) {
        ChessBoard.chessBoard = chessBoard;
    }
    public char[][] getChessBoard() {
        return chessBoard;
    }
    public static char getWhiteField() {
        return whiteField;
    }
    public static char getBlackField() {
        return blackField;
    }
    public void setChessBoard(char[][] chessBoard) {
        ChessBoard.chessBoard = chessBoard;
    }
    public static void setWhiteField(char whiteField) {
        ChessBoard.whiteField = whiteField;
    }
    public static void setBlackField(char blackField) {
        ChessBoard.blackField = blackField;
    }
    //    @Override
//    public String toString() {
//        return "ChessBoard{" +
//                "chessBoard=" + Arrays.toString(chessBoard[0]) +
//                '}';
//    }
    // metody dopisane

    @Override
    public String toString() {
        // zamienia całą tablicę na jeden ciąg znakow do drukowania
        // niestety NIE DZIALA
        // Dlaczego i co jest zle???
        String output = "";
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                output = output + chessBoard[i][j];
            }
            output = output + System.lineSeparator();
        }
        return output;
    }
    private static ChessBoard makeChessBoard(int n) {
        //tworzy nową tablice z szachownicą i zwraca ją
        //argument n określa ilość wierszy i kolumn n x n
        boolean isWhite = true;
        char white = getWhiteField();
        char black = getBlackField();
        char[][] varTable;
        varTable = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isWhite) {
                    varTable[i][j] = white;
                } else {
                    varTable[i][j] = black;
                }
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }

        return new ChessBoard(varTable);
    }
    public static void print(int n) {
        // metoda do drukowania szachownicy o podanej w parametrze ilosci pol n x n
        ChessBoard chessBoard = makeChessBoard(n);
        char[][] varTable = chessBoard.getChessBoard();
        for (int i = 0; i < varTable.length; i++) {
            for (int j = 0; j < varTable[i].length; j++) {
                System.out.print(varTable[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // uruchamiamy wczytywanie danych
        System.out.println("---------------------   Szachownica obiektowo   ---------------------------- ");
        System.out.println("Podaj ilość pól = ilości wierszy <n> gdzie n jest parzystą liczbą naturalną : ");
        int n = scanner.nextInt();
        setBlackField('X');  // zmieniamy kolor pól szachownicy
        setWhiteField('O');  // także zmieniamy kolor
        ChessBoard myChessBoard = makeChessBoard(n);  // tworzymy nowa szachownicę
        System.out.println("1. Drukuje z wykorzystaniem metody print");
        print(n);
        System.out.println("2. Drukuje na pieszo - odwołując się do kolejnych pól tablicy");
        char[][] varTable = myChessBoard.getChessBoard();
        for (int i = 0; i < varTable.length; i++) {
            for (int j = 0; j < varTable[i].length; j++) {
                System.out.print(varTable[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
        System.out.println("3. Drukuje z jednego stringu utworzonego przez metode toString");
        String oneLine = myChessBoard.toString();
        System.out.println(oneLine);
        System.out.println("4. Drukuje znak po znaku z tablicy, najpierw tworzac jeden duzy String");
        oneLine = "";
        for (int i = 0; i < varTable.length; i++) {
            for (int j = 0; j < varTable[i].length; j++) {
                oneLine = oneLine + varTable[i][j];
            }
            oneLine = oneLine + System.lineSeparator();
        }
        System.out.println(oneLine);
        System.out.println("-------- Koniec -----------");
    }

}
