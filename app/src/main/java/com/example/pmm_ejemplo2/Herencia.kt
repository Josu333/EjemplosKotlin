package com.example.pmm_ejemplo2

fun main(){
    val miTelefono:Telefono=Telefono(12234)
    miTelefono.llamar()
    miTelefono.mostarNumero()

    val miSmart=SmartPhone(4567, true)
    miSmart.llamar()
    miSmart.mostarNumero()
    val miSmart2=SmartPhone(4567, false)
    miSmart2.llamar()
    miSmart2.mostarNumero()
}