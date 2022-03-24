package com.mycompany.array;

interface vendible{
public float precioIva();
}


abstract class producto implements vendible{
    String nombre;
  float precio;
}


class alimentacion extends producto{
static float iva = 4;

alimentacion(){
this.nombre = "Leche";
this.precio = 10;
}
void setNombre(String nombre){
this.nombre = nombre;
}

void setPrecifloat (float precio){
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




class ropa extends producto{
static float iva = 10;

ropa(){
this.nombre = "Camiseta";
this.precio = 30;
}
void setNombre(String nombre){
this.nombre = nombre;
}

void setPrecifloat (float precio){
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










public class NewMain {

  
    public static void main(String[] args) {
     
        alimentacion leche = new alimentacion();
        System.out.println(leche.precioIva());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
