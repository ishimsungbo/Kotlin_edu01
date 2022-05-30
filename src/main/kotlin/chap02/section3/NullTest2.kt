package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null
    //println("str: ${str1.length}") ?형에 null 를 허용하면 실행될 수 없음 세이프콜
    //println("str: ${str1}")
    //println("str: ${str1?.length}")

    //조건식을 통해 null 상태 검사
    val len = if(str1 != null) str1.length else -1
    println("str: $str1 length: ${len}")

}