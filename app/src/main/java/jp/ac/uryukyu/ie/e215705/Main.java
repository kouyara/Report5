package jp.ac.uryukyu.ie.e215705;

public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("エラー!　NullPointerException　が発生！！");
            System.out.println(e.getMessage());
        }
    }

}
