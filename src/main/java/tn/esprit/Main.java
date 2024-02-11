package tn.esprit;

import tn.esprit.utils.MyDataBase;

public class Main {
    public static void main(String[] args) {
        A a = A.getInstance();
        A a1 = A.getInstance();

        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());

        MyDataBase b = MyDataBase.getInstance();
    }
}
