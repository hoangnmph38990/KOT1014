package com.example.hello_word


fun main() {

    var arrX = intArrayOf(1, 2, 3, 4)

    println(arrX.asList())

    println("Cac Phan Tu (.) X ")
    //c1
    for (x in arrX) {
        println(x)
    }
    arrX[0] = 5
    arrX[1] = 6
    arrX[2] = 7
    arrX[3] = 8
    //c2
    for (i in arrX.indices) {
        println("Phan Tu Thu $i Trong Mang x: ${arrX[i]}")
    }

    // Danh Sach

    //c1
    var listX = arrX.asList().toMutableList()
    listX.add(6)
    //c2
    for (i in listX.indices){
        println("Phan Tu Thu $i trong list x: ${listX[i]}")
    }

    val listY = mutableListOf(3, 4, 5, 6)
    listY.add(0, 1)
    listY.removeAt(listY.size - 1)
    println("ListY: $listY")

    //

    println("Nhap ten sv: ")
    var s = readLine()
    if (s != null){
        println(getMssv(s))
    }

}// fun main
private val MAPDSSV : Map<String, String> = mutableMapOf("PH38990" to "Nguyen Manh Hoang",
    "PH53623" to "Pham Tien Thanh")
    // When (switch case)
    fun getMssv(tenSV : String) : String?{

        when(tenSV){
            "Nguyen Manh Hoang" ->{
                return MAPDSSV.get(tenSV)
            }
            "Pham Tien Thanh" -> {
                return MAPDSSV.get(tenSV)
            }
        }
        return "werfwerw"
    }


class buoi2 {
}