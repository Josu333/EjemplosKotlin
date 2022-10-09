package com.example.pmm_ejemplo2

fun main(){
    val lista= listOf("campo1","campo2")
    println(lista)
    var lista2= mutableListOf<String>()
    lista2.add("uno")
    lista2.add("dos")
    println(lista2)
    for(item in lista2)
        println(item) //para visualizar uno por los elemntos de una lista

    val mapa=mapOf(Pair(1, "Hola que tal"),
    Pair(2,"Burgos"))
    println(mapa)

    var mapa2= mutableMapOf<Int,String>()
    mapa2[0]="Martes"
    mapa2.put(1,"4 de octubre")
    mapa2.forEach(){
        println(it)
    }
}