/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6p2e1;

/**
 *
 * @author Bauti
 */
public class ED3S6P2e1 {
public ED3S6P2e1(int a){
       //suma1(a);
       valores(a);
       System.out.println("valor de a " + a);
}
    private void suma1(int a){
        if (a>10) ;
        else suma1(a+1);
        System.out.println("la factorial: "+ factorial(5));
    }
    private int valores(int a){
        if (a<5) System.out.println("valor de a " + (a*valores(a+1)));
        return a;
    }
    private int factorial(int a){
        int fac=1;
        if (a == 0 || a==1) return 1;
        else if(a>1) fac = a*factorial(a-1);
        return fac;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new ED3S6P2e1(1);
    }
    
}
