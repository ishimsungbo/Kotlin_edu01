package chap03.section01

//fun 함수 이름([변수 이름: 자료형, 변수이름 : 자료형]): 반환값의 자료형{ 표현식  [return 반환값] }
fun sum(a:Int, b:Int): Int{
    var sum = a + b
    return sum
}

fun main() {
    var result1 = sum(3,2)
    var result2 = sum(6,7)

    println(result1)
    println(result2)
}