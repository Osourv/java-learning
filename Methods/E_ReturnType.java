package Methods;

public class E_ReturnType {
//     public static int sourav() {//int sourav is built in method also hold a value 
//         System.out.println("hello");
//         System.out.println("world!");
//         return 6; //khatam
//     }
//     public static void main(String[] args) {
//         sourav();//stand alone call lgai bas 
//         System.out.println(3+sourav());//show value+call
//     }
// }
public static int sourav(int a) {
    System.out.println("hello world!");
    if(a>0) return 5;
    else return 10;
}
public static void main(String[] args) {
    int x =sourav(7);
    System.out.println(4+x);
}
}