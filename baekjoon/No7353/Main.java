package 팀장문제.baekjoon.No7353;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> Back = new Stack<>();
        Stack<String> Forward = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String URL = "http://www.acm.org/";
        String URL2 = "";
        while(true) {
            String input = sc.nextLine();
            if (input.contains("VISIT")) {
                URL2 = input.substring(6);
                input = input.substring(0,5);
            }
            switch (input) {
                case "VISIT":
                    Back.push(URL);
                    URL = URL2;
                    System.out.println(URL);
                    Forward.clear();
                    break;
                case "BACK":
                    if(!Back.empty()) {
                        Forward.push(URL);
                        URL = Back.pop();
                        System.out.println(URL);
                        break;
                    } else {
                        System.out.println("Ignored");
                        break;
                    }
                case "FORWARD":
                    if(!Forward.empty()) {
                        Back.push(URL);
                        URL = Forward.pop();
                        System.out.println(URL);
                        break;
                    } else {
                        System.out.println("Ignored");
                        break;
                    }
                case "QUIT":
                    return;
            }
        }
    }
}
