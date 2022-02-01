package com.sparta.codeKataExercises;

public class Main {
    public static void main(String[] args) {
        W3SchoolsEx w3s = new W3SchoolsEx();

        W3SchoolsEx.InnerClass inner = w3s.new InnerClass();

        System.out.println(w3s.x + inner.y);

    }
}
