package com.example.pmm_ejemplo2

open class  Telefono(protected val numero:Int) {
    /*protected val numero:Int
    init{
    this.numero=numero
    }
    --> otra forma de hacerlo
    */

    fun llamar(){
        println("Llamando...")
    }
    open fun mostarNumero(){
        println("El numero es: $numero")
    }
}