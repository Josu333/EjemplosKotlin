package com.example.pmm_ejemplo2

fun main(){
    var a=1; //Variable Mutable (Su valor puede cambiar)
    val b=2; //Variable Inmutable (No va a cambiar su valor)
    var c:Int=12;
    var nombre:String?; //La interrogación al lado de un dato hace que este pueda ser null

    // TODO Esto es un comentario especial que se puede ver desde cualquier otro lado

    println("Hello World");

    println(a);
    println(b);

    a=a+2;

    println("El valor actual de a=$a y el de b=$b");


    var resultado=suma(3,4);
    println("$resultado es el resultado de la Funcion Suma");

    resultado= resta(a,b);
    println("$resultado es el resultado de la Funcion Resta");

    mostrarProducto("Boligrafo");
    mostrarProducto("Lapicero", 330);
    mostrarProducto("Completo", 22, 33);
    mostrarProducto("A medias 1",44444);
    mostrarProducto("A medias", promo = 11111, vigencia = 55555);

    mostrarValores(indice =666, concepto="Error");

}

fun suma(a:Int, b:Int):Int{
    return a+b;
}
fun resta(a:Int, b:Int)= a-b; //Si es solo una instruccion, se puede simplificar como en este caso

fun mostrarProducto(nombre:String, vigencia:Int=10, promo:Int=222):Unit{//como void en java
    println();
    println("Nombre: $nombre");
    println("Vigencia: $vigencia");
    println("Promo: $promo");
}
fun mostrarValores(indice:Int,concepto:String):Unit{
    println("indice $indice");
    println("concepto $concepto")
}


