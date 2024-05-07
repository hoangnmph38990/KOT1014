package com.example.hello_word


fun main() {
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

    println("Thuong 2 so $soA & $soB la : " + phepchia(soA, soB));
    bai1()
    bai2()

}

fun phepchia(soA: Int, soB: Float): Float {

    if (soB == 0f) {
        return 0f
    }

    val thuong = soA / soB;

    return thuong
}

fun bai1() {
    println("\n");
    print("Nguyễn Mạnh Hoàng - PH38990\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không.")
    println("---------------------------------")
}

fun bai2() {
        var a = 0.0;
        var b = 0.0;
        println("Nhập a:");
        var s = readLine();
        if (s != null) a = s.toDouble();
        println("Nhập b:");
        s = readLine();
        if (s != null) b = s.toDouble();
        println("Tổng: " + (a + b));
        println("Hiệu: " + (a - b));
        println("Tích: " + (a * b));
        println("Thương: " + (a / b));
}
class lab1 {
}