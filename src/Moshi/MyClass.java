//package Moshi;
////饿汉式单例
//class Singleton{
//    private static Singleton singleton = new Singleton();
//    private Singleton(){}
//    public  static Singleton getSingleton(){
//        return singleton;
//    }
//}
//class Color{
//    private String name;
//    private static Color red = new Color("");
//    private static Color yellow = new Color("");
//    private static Color blue = new Color("");
//    private Color(String name){
//        this.name = name;
//    }
//    public static Color getInstance(String name){
//        switch (name){}
//        return null;
//    }
//    public String toString(){
//        return name;
//    }
//}
//public class MyClass {
//    public static void main(String[] args) {
//        Isubject<Integer,String> isubject = String::compareTo;
//        System.out.println(isubject.switchPara(1,"2"));
//    }
//}
//interface Isubject<P,R>{
//    R switchPara(P p1,R r1);
//}
//
//
