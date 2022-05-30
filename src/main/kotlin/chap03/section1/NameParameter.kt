package chap03.section1

fun main() {
    nameParam(x=200, z=200)
    nameParam(z=150)
}

fun nameParam(x: Int = 100, y: Int = 200, z: Int){
    println(x + y + z)
}