public class Main {

public static void main(String[]args){

    Persona juliana = new Persona ("Juliana", "12345678", "mujer");
    Iphone iphone = new Iphone("Iphone 11",123542,"8.1");
    //juliana.usarCelular(iphone);
    //iphone.perderBateria();

    Persona catalina = new Persona ("Catalina", "12345678", "mujer");
    Motorola motorola = new Motorola ("Motorola X", 122314, "5.0");
    //catalina.usarCelular(motorola);
    //motorola.perderBateria();

    juliana.hacerLlamada(iphone,motorola,catalina);
    
        }

}