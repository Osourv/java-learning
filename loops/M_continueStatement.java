package loops;

public class M_continueStatement {
public static void main(String[] args) {
    // 2 3 4 6 8 9.... 2,3 ki multiplication likhni hai

    // for(int i=2; i<=100; i++){
    // if(i==14 || i==27) continue;
    //     if(i%2==0 || i%3==0){
    //         System.out.println(i);
    //     }

    for(int i = 1; i<=100; i++){
        System.out.println("hello world!");
        if(i%2==0) continue;// continue ke niche wali line nhi chlegi wo skip ho jayegi
        System.out.println(i);
    }





    }
}    

