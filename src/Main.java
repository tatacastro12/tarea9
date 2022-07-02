public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        trabajador.Nombre = "Giovanni ochoa";
        trabajador.edad = 40;
        trabajador.Telefono = "325889856";
        trabajador.Salario = 2500000;
        trabajador.credito = "Aprobado";

        System.out.println("Mi nombre es " + trabajador.Nombre);
        System.out.println("Mi edad es " + trabajador.edad);
        System.out.println("Mi telefono es " + trabajador.Telefono);
        System.out.println("Mi Salario es " + trabajador.Salario);
        System.out.println("Mi credito  fue " + trabajador.credito);

    }
     static class Persona{
        int edad;
        String  Nombre;
        String Telefono;
    }
      static class Cliente extends Persona{
        String credito;
    }
    static class Trabajador extends Cliente{
        int Salario;
    }
    }



