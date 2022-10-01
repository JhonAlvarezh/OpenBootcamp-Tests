public class Main {

    public static void main(String[] args){
        suma(5,10,15);

        Coche miCoche = new Coche();

        miCoche.IncrementoPuerta();
        System.out.println("El numero de puertas del coche es " + miCoche.NumeroDePuertas);
    }

    // Funcion de suma.
    public static void suma(int param1,int param2,int param3){
        int resultado;
        resultado = param1 + param2+ param3;
        System.out.println("El resultado de tu suma es " + resultado);
    }
}

class Coche {
    public int NumeroDePuertas = 0;

    // Funcion de añadir puerta.
    public void IncrementoPuerta(){

        this.NumeroDePuertas++;
    }
}