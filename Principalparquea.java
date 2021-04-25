import java.util.*;
public class Principalparquea{
   public static void main (String[]args){
       Scanner scannpe = new Scanner (System.in);
       
       System.out.println ("Ingrese la cantidad de pisos:");
       int pisos = scannpe.nextInt();
       System.out.println ("Ingrese la cantidad de espacios");
       int espacios = scannpe.nextInt();
       Vehiculo parqueadero = new Vehiculo ();
       parqueadero.dimension (pisos, espacios);
       Sensor sensores = new Sensor ();
       sensores.dimension (pisos, espacios);
       boolean preguntar = true;
               
        do{
            System.out.println ("\nQue opcion desea ingresar:" + "\n" +
           "0. Salir." + "\n" + 
           "1. Consultar sensores desocupados." + "\n" + 
           "2. Asignar el parqueadero a un vehiculo sin valor." + "\n" + 
           "3. Asignar el parqueadero a un vehiculo con valor." + "\n" + 
           "4. Consultar la informacion de todos los vehiculos." + "\n" + 
           "5. Consultar la cantidad de vehiculos." + "\n" + 
           "6. Consultar el estado de un parqueadero." + "\n" + 
           "7. Consultar el estado de todos los parqueaderos.");
            int opcion = scannpe.nextInt();
            
            switch (String.valueOf(opcion)){
                case "0": 
                    System.out.println ("Saliendo...") ;
                    preguntar = false;
                    break;
                    
                case "1": 
                    System.out.println(sensores.sensorLibres());
                    break;
                    
                case "2": 
                    boolean validacion = false;
                    int piso = 0;
                    int espacio = 0;
                    String placa, marca, color;
                    
                    do{
                        System.out.println("En que piso desea parquear: ");
                        piso = scannpe.nextInt();
                        System.out.println("En que espacio del piso desea parquear: ");
                        espacio = scannpe.nextInt();
                        System.out.println(sensores.validacion (piso, espacio));
                        
                        if (sensores.validacion (piso, espacio) == ""){
                            validacion = true;
                        }
                    }while (!validacion);
                    
                    if (sensores.validarDisponibilidad(piso, espacio)){
                            System.out.println("Ingrese la placa");
                            scannpe.nextLine();
                            placa = scannpe.nextLine();
                            System.out.println("Ingrese la marca");
                            marca = scannpe.nextLine ();
                            System.out.println("Ingrese el color");
                            color = scannpe.nextLine ();
                            
                            Vehiculo carro = new Vehiculo (placa, marca, color);
                            Sensor sensor = new Sensor(1);
                            
                            parqueadero.arreglo_vehiculos[piso][espacio] = carro;                       
                            sensores.arreglo_sensor[piso][espacio] = sensor;
                            
                            System.out.println(carro.toString());
                            System.out.println(sensor.getEstado());
                        }
                        
                    
                    break;
                    /*
                case 3: ...;
                    break;
                    
                case 4: ... ;
                    break;
                    
                case 5: ... ;
                    break;
                    
                case 6: ... ;
                    break;
                    
                case 7: ... ;
                    break;
                    */
                default: System.out.println ("Comando incorrecto"); 
                    break;
         }
        }while(preguntar);             

      }
}