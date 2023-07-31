package 팀장문제.김명언.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cowsays {
    int number;
    String cowsay;
    String author;

    public cowsays(int number, String cowsay, String author) {
        this.number = number;
        this.cowsay = cowsay;
        this.author = author;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCowsay() {
        return cowsay;
    }

    public void setCowsay(String cowsay) {
        this.cowsay = cowsay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
