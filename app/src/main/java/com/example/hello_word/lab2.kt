package com.example.hello_word

fun main (){
    val xe1 = Xehoi("xe 1 ", 100000f)
    val xe2 = Xehoi("xe 2", 300000f, 2024)

    xe1.tenXe = "Ten xe moi 2024"
    println(xe1.hienthi())
    println(xe2.hienthi())
}

class Xehoi (var tenXe : String, var giaXe : Float){

    var namSX : Int? = 0
    constructor(tenXe: String, giaXe: Float, namSX : Int) : this(tenXe, giaXe){
        if (namSX != null)
        this.namSX = namSX
    }
    fun hienthi() : String{
        if (namSX == 0){
            return "Ten xe : $tenXe Gia xe: $giaXe"
        } else {
            return "Ten xe : $tenXe Gia xe : $giaXe Nam SX : $namSX"
        }

    }
}


class lab2 {
}