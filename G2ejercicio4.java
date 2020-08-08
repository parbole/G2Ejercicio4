import java.util.Scanner;

public class G2ejercicio4{
    public static void main(String[] args) {
        double valor, resultado, impuesto;
        String tipo;
        
        resultado = 0;
        
        System.out.print("Programa para calcular el valor del vehiculo" + "\n" + "Digite el tipo de vehiculo: \n" + "\n" + "C para Camionetas"
        + "\n" + "A para Automovil" + "\n\n");
        
        Scanner teclado = new Scanner(System.in);
        tipo = teclado.nextLine();
        
        while (!tipo.equals("C")  && !tipo.equals("A")) {
            
            System.out.print("Ingrese un tipo de vehiculo correcto " + "\n");
            tipo = teclado.nextLine();
         
        }
        
        System.out.print("Digite el valor del vehiculo entre 10 y 100 pesos " + "\n");
        
        valor = teclado.nextDouble();
        
        while (valor < 10 || valor > 100) {
            
            System.out.print("Ingrese el valor del vehiculo entre 10 y 100 " + "\n");
            valor = teclado.nextDouble();
         
        }
        
        
        if (tipo.equals("C") && valor < 80) {
            System.out.print("El precio neto de la camioneta es $" + valor +  " No tienes que pagar impuesto " + "\n");
        }
        else if (tipo.equals("C") && valor >= 80) {
            impuesto = valor / 2;
            resultado = valor + impuesto;
            System.out.print("El precio bruto de la camioneta es $" + valor +  " El impuesto a pagar es $" + impuesto + " El precio neto es $" + resultado + "\n");
        }
        else if (tipo.equals("A") && valor < 20) {
            impuesto = 5;
            resultado = valor + impuesto;
            System.out.print("El precio bruto del automovil es $" + valor +  " El impuesto a pagar es $" + impuesto + " El precio neto es $" + resultado + "\n");
        }
        else if (tipo.equals("A") && (valor >= 20 && valor <= 40)) {
            impuesto = valor / 5;
            resultado = valor + impuesto;
            System.out.print("El precio bruto del automovil es $" + valor +  " El impuesto a pagar es $" + impuesto + " El precio neto es $" + resultado + "\n");
        }
        else if (tipo.equals("A") && valor > 40) {
            impuesto = 9;
            resultado = valor + impuesto;
            System.out.print("El precio bruto del automovil es $" + valor +  " El impuesto a pagar es $" + impuesto + " El precio neto es $" + resultado + "\n");
        }
        
        
        

        
    }
}