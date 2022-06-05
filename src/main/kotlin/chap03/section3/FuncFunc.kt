package chap03.section3

//반환값에 일반 함수 사용해보기

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sumi(a: Int, b: Int) = a+b

fun funcFunc(): Int {
    return sumi(2, 2)
}