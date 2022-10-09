package com.example.pmm_ejemplo2

class SmartPhone(numero:Int, val es:Boolean):Telefono(numero) {
//propiedad 'numero' no lleva ni var ni val porque es propiedad de la clase 'telefono'
    val esPrivada:Boolean
    init{
        esPrivada=es
    }

override fun mostarNumero(){ //hay que poner 'open' delante del metodo a reescribir de la clase telefono
       if(esPrivada){
           println("Desconocido")
       }else{
           println(numero)
       }
    }
}