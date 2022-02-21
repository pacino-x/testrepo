package cn.xay.StringDemo;

public class testString {
    public static void main(String[] args) {
        byte[] bys = {97,98,99};
        String s1 = new String(bys);
        System.out.println(s1);

        char[] s = {'h','e','l','l','o'};
        String s2 = new String(s);
        System.out.println(s);

        String s3 = "ab";//String优化免new
        System.out.println(s3);

        String str1 = "abc";
        String str2 = "aBc";
        boolean b1 = str1.equalsIgnoreCase(str2);
        System.out.println("equalsIgnoreCase  "+b1);

        String str3 = "abcd";
        boolean b2 = str3.startsWith("a");
        System.out.println("startWith  "+b2);
    }
}
