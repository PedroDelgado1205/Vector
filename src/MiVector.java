import java.util.Vector;

public class MiVector {
    public static void main(String[] args) {
        Vector v = new Vector();
        int []a = new int[10];
        Persona p1 = new Persona("Pedro", 20);
        Persona p2 = new Persona("Miguel", 20);
        Persona p3 = new Persona("Delgado", 20);
        Persona p4 = new Persona("Bravo", 20);
        Persona p5 = new Persona("Pemildebra", 20);
        Persona p6 = new Persona("Pmdb", 20);
        Persona p7 = new Persona("Qwerty", 20);
        Persona p8 = new Persona("Ytrewq", 20);
        Persona p9 = new Persona("Hola", 20);
        Persona p10 = new Persona("Mundo", 20);
        a[0]=5;
        v.add(p1);
        v.add(p2);
        v.add(p3);
        v.add(p4);
        v.add(p5);
        v.add(p6);
        v.add(p7);
        v.add(p8);
        v.add(p9);
        v.add(p10);
        System.out.println(v.capacity());
        System.out.println(a.length);
        for (int i=0; i < v.capacity(); i++){
            Persona nom = (Persona)v.elementAt(i);
            System.out.println(nom.nombre+" "+nom.edad);
        }
    }
}
