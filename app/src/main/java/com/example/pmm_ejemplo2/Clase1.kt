package com.example.pmm_ejemplo2

class Clase1(nombre:String) {
    var nombre:String=nombre
    set(value){
        field=if(value.isEmpty())"Sin nombre" else value
    }
    get() {
        return "El nombre es ${field.uppercase()} " //
    }

    var edad:Int=0
    get()= if(field==0) 999 else field //se pone la propiedad generica no la concreta (no'edad')

    init {              //constructor primario; SOLO PUEDE HABER UNO (ya no hay constructor por defcto como en java)
        this.nombre=nombre
        edad=0
    }
    constructor(nombre:String, edad:Int):this(nombre){ // PUEDE HABER VARIOS
        this.edad=edad
    }

}