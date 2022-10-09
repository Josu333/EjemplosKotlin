package com.example.pmm_ejemplo2

fun main(){
    var objeto=Clase1("")
    println(objeto.nombre)
    println(objeto.edad)

    val objeto2=Clase2("Maria")
    println(objeto2.nombre)

    val objeto3=Clase1("Jesus", 22)
    println(objeto3.nombre)
    println(objeto3.edad)
    objeto3.nombre=""
    println(objeto3.nombre)
}