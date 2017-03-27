package com.bkav.javacoban;

public class  XauKiTu{

    public static void main(String[] args) {
        String str = "Xin chao cac ban.Minh la Hung!";
       
        System.out.println("str = " + str);

        System.out.println("str.substring(9) = " + str.substring(9));

        System.out.println("str.substring(4,9) = " + str.substring(4, 9));

        System.out.println("str.length() = " + str.length());

        char ch;
        ch = str.charAt(4);
        System.out.println("str.charAt(4) = " + ch);

        System.out.println("Thay n to x = " + str.replace('n', 'x'));

        System.out.println("Thay replaceFirst ao to xxx = " + str.replaceFirst("ao", "xxx"));

        System.out.println("Thay replaceAll un to xxx = " + str.replaceAll("un", "xxx"));

        System.out.println("str : Lower = " + str.toLowerCase());

        System.out.println("str : Upper = " + str.toUpperCase());

        String str1 = "  "+str+"  ";
        System.out.println("Loai bo khoang trong hai ben chuoi-->"+str1.trim());

    }
}