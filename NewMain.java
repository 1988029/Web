package com.mycompany.array;
//1696627@alu.murciaeduca.es






interface vendible{
public float precioIva();
}


abstract class Producto implements vendible{
    String nombre;
  float precio;
}


class Alimentacion extends Producto{
static float iva = 4;

Alimentacion(){
this.nombre = "Leche";
this.precio = 10;
}
void setNombre(String nombre){
this.nombre = nombre;
}

void setPrecio (float precio){
this.precio = precio;
}

String getNombre(){
return this.nombre;
}float getPrecio(){
return this.precio;
}

public float precioIva(){
return this.precio + this.iva * this.precio / 100;
}
}



class Ropa extends Producto{
static float iva = 10;

Ropa(){
this.nombre = "Camiseta";
this.precio = 30;
}

void setNombre(String nombre){
this.nombre = nombre;
}
void setPrecio (float precio){
this.precio = precio;
}

String getNombre(){
return this.nombre;
}float getPrecio(){
return this.precio;
}

public float precioIva(){
return this.precio + this.iva * this.precio / 100;
}
}



class Viaje implements vendible{
int iva=21;
int precio=100;
int ndias=7;
String origen = "Murcia";
String destino = "Hong Kong";
        
void setPrecio(int precio){
this.precio = precio;
}
void setNdias(int ndias){
this.ndias = ndias;
}
void setDestino(String destino){
this.destino = destino;
}
int getPrecio(){
return this.precio;
}
int getNdias(){
return this.ndias;
}
String getDestino(){
return this.destino;
}

public float precioIva(){
return this.precio + this.iva * this.precio / 100;
}
}






public class NewMain {

  
    public static void main(String[] args) {
    
    
        Alimentacion leche = new Alimentacion();
        Alimentacion galletas = new Alimentacion();
        Ropa camiseta = new Ropa();
        Viaje viaje = new Viaje();
        
          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*
       vendible array[] = new vendible[4];
       array [0] = leche;
       array [1] = galletas;
       array [2] = camiseta;
       array [3] = viaje;
       
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Alimentacion){
            Alimentacion a1=(Alimentacion) array[i];
                System.out.println(a1.nombre);
                System.out.println(a1.precio);
            }
            if (array[i] instanceof Ropa){
            Ropa r1 = (Ropa) array[i];
                System.out.println(r1.nombre);
                System.out.println(r1.precio);
                }
            if (array[i] instanceof Viaje){
            Viaje v1 = (Viaje) array[i];
                System.out.println(v1.origen);
                System.out.println(v1.destino);
                System.out.println(v1.ndias);
                System.out.println(v1.precio);
            }
        }
        */
        
        
        
        
    }

}
