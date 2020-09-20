package com.company;
import java.util.Scanner;

class Word {
     String word_target;
     String word_explain;
    public static void main(String[] args) {

    }
}

class Dictionary{
    Word[] Words = new Word[50];
    public Dictionary(){
    }
}

class DictionaryManagement{
    Scanner sc = new Scanner(System.in);
    Dictionary DicEV = new Dictionary();
    int numberWord = sc.nextInt();
    public void insertFromCommandline(){
        for (int i = 0;i < numberWord; i++){
            DicEV.Words[i].word_target = sc.nextLine();
            DicEV.Words[i].word_explain = sc.nextLine();
        }
    }
}

class DictionaryCommandLine{
    public void showAllWords(){
        Dictionary DicEV = new Dictionary();
        System.out.println("No    | Endlish          | Vietnamese      ");
        for (int i = 0; i < DicEV.Words.length ; i++){
            System.out.println( (i+1) + "    | " + DicEV.Words[i].word_target +"         | " + DicEV.Words[i].word_explain);
        }
    }

    public void dictionaryBasic(){
        DictionaryManagement dicMana = new DictionaryManagement();
        dicMana.insertFromCommandline();
        showAllWords();
    }
}
