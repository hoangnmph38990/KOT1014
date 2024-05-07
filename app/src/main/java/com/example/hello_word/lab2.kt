package com.example.hello_word

<<<<<<< HEAD
fun main (){
=======
fun main() {
>>>>>>> 1eefdaf (Commit)
    val xe1 = Xehoi("xe 1 ", 100000f)
    val xe2 = Xehoi("xe 2", 300000f, 2024)

    xe1.tenXe = "Ten xe moi 2024"
    println(xe1.hienthi())
    println(xe2.hienthi())
<<<<<<< HEAD
}

class Xehoi (var tenXe : String, var giaXe : Float){

    var namSX : Int? = 0
    constructor(tenXe: String, giaXe: Float, namSX : Int) : this(tenXe, giaXe){
        if (namSX != null)
        this.namSX = namSX
    }
    fun hienthi() : String{
        if (namSX == 0){
=======
    println(bai_1())
    println(bai_2())
    println(bai_3())
}

class Xehoi(var tenXe: String, var giaXe: Float) {

    var namSX: Int? = 0

    constructor(tenXe: String, giaXe: Float, namSX: Int) : this(tenXe, giaXe) {
        if (namSX != null)
            this.namSX = namSX
    }

    fun hienthi(): String {
        if (namSX == 0) {
>>>>>>> 1eefdaf (Commit)
            return "Ten xe : $tenXe Gia xe: $giaXe"
        } else {
            return "Ten xe : $tenXe Gia xe : $giaXe Nam SX : $namSX"
        }

    }
}


<<<<<<< HEAD
class lab2 {
}
=======
fun bai_1() {

    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }

}

fun bai_2() {

        var month = 0
        println("Nhập tháng:")
        val s: String? = readLine()
        if (s != null) month = s.toInt()
        when (month) {
            1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
            4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
            7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
            10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
            else -> println("Tháng " + month + " không hợp lệ")

    }
}

fun bai_3(){

    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")

}


    class lab2 {
    }
>>>>>>> 1eefdaf (Commit)
