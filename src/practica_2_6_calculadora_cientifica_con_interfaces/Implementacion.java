package practica_2_6_calculadora_cientifica_con_interfaces;
/**
 *
 * @author rafael
 */
public class Implementacion {
    public static void main(String[] args) {
        Practica_2_6_Calculadora_cientifica_con_interfaces Opra=new Practica_2_6_Calculadora_cientifica_con_interfaces();

        System.out.println("OBJETO 1");
        Opra.Practica_2_6_Calculadora_cientifica_con_interfaces();
        Opra.setnum1(Opra.entrada());
        Opra.setnum2(Opra.entrada());
        Opra.Suma(Opra.getnum1(), Opra.getnum2());
        Opra.Resta(Opra.getnum1(), Opra.getnum2());
        Opra.Multiplicacion(Opra.getnum1(), Opra.getnum2());
        Opra.Divicion(Opra.getnum1(), Opra.getnum2());
        Opra.potencia(Opra.getnum1(), Opra.getnum2());
        Opra.absoluto(Opra.getnum1());
        Opra.absoluto(Opra.getnum2());
        Opra.raiz(Opra.getnum1());
        Opra.raiz(Opra.getnum2());
        Opra.tangente(Opra.getnum1());
        Opra.tangente(Opra.getnum2());
        Opra.seno(Opra.getnum1());
        Opra.seno(Opra.getnum2());
        Opra.coseno(Opra.getnum1());
        Opra.coseno(Opra.getnum2());
        System.out.println("------------------FIN OBJETO------------------");

    }
    
}
