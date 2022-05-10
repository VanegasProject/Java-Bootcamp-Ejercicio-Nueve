// Desarrollado por Luis Vanegas
// la variable telefono la defino como String ya que le adjunto el codigo de area de mi pais
// y conforme al salario del trabajador utilize el tipo de moneda de mi pais
// pstData: Soy de nicaragua :)

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nombre = "Luis Vanegas";
        cliente.edad = 27;
        cliente.telefono = "+50582999448";
        cliente.credito = 10000;
        System.out.println("Me llamo " + cliente.nombre + ", actualmente tengo " + cliente.edad + " años y mi numero celular es " + cliente.telefono
                + " y mi credito en su tienda es de $ " + cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Bruce Wayne";
        trabajador.edad = 42;
        trabajador.telefono = "+529265326412";
        trabajador.salario = 12150.50;
        System.out.println("Mi nombre es " + trabajador.nombre + ", tengo la edad de " + trabajador.edad + " años y mi celular es " + trabajador.telefono
                + " y mi salario mensual es de C$ " + trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}


