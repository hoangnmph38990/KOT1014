package com.example.hello_word


fun main(){
    println("Nguyen Manh Hoang");
    println("Lab 1 - MD18307");
    //
    var a = 1;
    var b = 2;

    var c = a + b;
    println("Tong 2 so $a & $b la : $c");

    //

    val soA = 10
    val soB = 5f

    println("Thuong 2 so $soA & $soB la : " + phepchia(soA,soB));

}

fun phepchia ( soA : Int, soB :Float) : Float {

    if (soB == 0f){
        return 0f
    }

    val thuong = soA / soB;

    return thuong
}


class lab1 {
}