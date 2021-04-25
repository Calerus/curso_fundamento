public class Vehiculo{
    static Vehiculo [][] arreglo_vehiculos;
    static int tamano;
    static int cantidad = 0;
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    
    public Vehiculo (){   
    } 
    
    public void dimension (int tam, int cantid){
        this.tamano = tam*cantid;
        this.arreglo_vehiculos = new Vehiculo [tam][cantid];
    }

    public Vehiculo (String placa, String marca, String color, int valor){
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.valorComercial = valor;
        this.cantidad ++; 
    }
    
        public  Vehiculo (String placa, String marca, String color){
        Vehiculo veh = new Vehiculo (placa, marca, color, 30000000);
        //System.out.println(veh.getPlaca());

    }

    public String toString (){
     return "Placa: "+ this.placa + "\n" + 
            "Marca: " + this.marca + "\n" +
            "Color: " + this.color + "\n" +
            "Valor Comercial: " + this.valorComercial;
    }

    public static String toStringVehiculos (){
        String info = "\n";
        for(int i = 0; i<arreglo_vehiculos.length; i++){
          for (int j = 0; j<arreglo_vehiculos[0].length; j++){
            if (arreglo_vehiculos[i][j] != null){
             info = info + "\n" + arreglo_vehiculos[i][j].toString();
            }                             
          }
        }    
        return info;
    }

    public static int cantidadVehiculos (){
       return cantidad;
    }
    
    public int getTamano(){
        return this.tamano;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getPlaca(){
        return this.placa;
    }
    public String getMarca(){
        return this.placa;
    }
    public String getColor(){
        return this.color;
    }
    public int getValorComercial(){
        return this.valorComercial;
    }
    public void setTamano(int tam){
        this.tamano = tam;
    }
    public void setCantidad (int cant){
        this.cantidad = cant;
    }
    public void setPlaca(String plac){
        this.placa = plac;
    }
    public void setMarca (String marc){
        this.marca = marc;
    }
    public void setColor (String col){
        this.color = col;
    }
    public void setValorComercial (int vacom){
        this.valorComercial = vacom; 
    }
}


