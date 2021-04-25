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
                   
                    do{
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
                            validacion = true;
                        }
                    }while (!validacion);    
                    
                    break;
                    
                case "3": 
                boolean validacion1 = false;
                    int piso1 = 0;
                    int espacio1 = 0;
                    int valorcarro;
                    String placas, marcas, colors;
                    
                    do{
                        System.out.println("En que piso desea parquear: ");
                        piso1 = scannpe.nextInt();
                        System.out.println("En que espacio del piso desea parquear: ");
                        espacio1 = scannpe.nextInt();
                        System.out.println(sensores.validacion (piso1, espacio1));
                        
                        if (sensores.validacion (piso1, espacio1) == ""){
                            validacion1 = true;
                        }
                    }while (!validacion1);
                    
                    do{
                        if (sensores.validarDisponibilidad(piso1, espacio1)){
                            System.out.println("Ingrese la placa");
                            scannpe.nextLine();
                            placas = scannpe.nextLine();
                            System.out.println("Ingrese la marca");
                            marcas = scannpe.nextLine ();
                            System.out.println("Ingrese el color");
                            colors = scannpe.nextLine ();
                            System.out.println("Ingrese el valor del carro");
                            valorcarro = scannpe.nextInt ();
                            
                            Vehiculo carro = new Vehiculo (placas, marcas, colors, valorcarro);
                            Sensor sensor = new Sensor(1);
                            
                            parqueadero.arreglo_vehiculos[piso1][espacio1] = carro;                       
                            sensores.arreglo_sensor[piso1][espacio1] = sensor;
                            
                            System.out.println(carro.toString());
                            System.out.println(sensor.getEstado());
                            validacion1 = true;
                        }
                    }while (!validacion1);    
                    break;
                    
                    
                case "4": 
                    
                    System.out.println (parqueadero.toStringVehiculos());
                    
                    break;
                    
                case "5": 
                    
                    System.out.println ("La cantidad de vehiculos es:" + parqueadero.cantidadVehiculos());
                
                    break;
                    
                case "6": 
                    boolean validacion2 = false;
                    do{
                        System.out.println("En que piso desea mostrar el estado: ");
                        piso = scannpe.nextInt();
                        System.out.println("En que espacio del piso desea mostrar el estado: ");
                        espacio = scannpe.nextInt();
                        System.out.println(sensores.validacion (piso, espacio));
                        
                        if (sensores.validacion (piso, espacio) == ""){
                            validacion2 = true;
                        }
                    }while (!validacion2);
                    System.out.println ("el estado del sensor es: " + sensores.arreglo_sensor[piso][espacio].toString());
                    break;
                    
                case "7": 
                    
                    System.out.println (sensores.sensoresEstado());
                
                    break;
                    
                default: System.out.println ("Comando incorrecto"); 
                    break;
         }
        }while(preguntar);             

      }
}