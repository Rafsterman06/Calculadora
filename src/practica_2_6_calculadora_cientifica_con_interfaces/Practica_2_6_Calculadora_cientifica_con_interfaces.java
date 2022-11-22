package practica_2_6_calculadora_cientifica_con_interfaces;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class Practica_2_6_Calculadora_cientifica_con_interfaces {
        public int entrada(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        return sc.nextInt();
    }
    private int num1,num2;
    public void Practica_2_6_Calculadora_cientifica_con_interfaces(){
        this.num1=0;
        this.num2=0;
    }
    public void Practica_2_6_Calculadora_cientifica_con_interfaces(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void setnum1(int num1){
        this.num1=num1;
    }
    public int getnum1(){
        return this.num1;
    }
    public void setnum2(int num1){
        this.num2=num1;
    }
    public int getnum2(){
        return this.num2;
    }
    public void Suma(int num1,int num2){
        int suma=num1+num2;
        System.out.println(num1+" + "+num2+" = "+suma);
    }
    public void Resta(int num1,int num2){
        int resta=num1-num2;
        System.out.println(num1+" - "+num2+" = "+resta);
    }
    public void Multiplicacion(int num1,int num2){
        int multiplicacion=num1*num2;
        System.out.println(num1+" * "+num2+" = "+multiplicacion);
    }
    public void Divicion(int num1,int num2){
        if (num2!=0) {
            float divicion=num1/num2;
            System.out.println(num1+" / "+num2+" = "+divicion);
        }
        else System.out.println("No se puede dividir entre 0");
    } 
    public void potencia(int num1,int num2){
        System.out.println(num1+" ^ "+num2+" = "+Math.pow(num2, num1));
    }
    public void absoluto(int num1){
        System.out.println("|"+Math.abs(num1)+"|");
    }
    public void raiz(int num1){
        System.out.println("Raiz cuadrada de "+num1+" = "+Math.sqrt(num1));
    }
    public void tangente(int num1){
        System.out.println("Tangente de "+num1+" = "+Math.tan(num1));
    }
    public void seno(int num1){
        System.out.println("Seno de "+num1+" = "+Math.sin(num1));
    }
    public void coseno(int num1){
        System.out.println("coseno de "+num1+" = "+Math.cos(num1));
    }
}