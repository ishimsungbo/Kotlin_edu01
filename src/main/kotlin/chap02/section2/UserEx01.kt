package chap02.section2

fun main() {

    // Ctrl + Shift + P 를 누르면 추론된 자료형을 알 수 있다.

    val num05 = 127
    val num06 = -32768
    val num08 = 1

    println(num05)
    println(num06)

    val exp01 = 123
    val exp02 = 123L

    // Int 보다 적은 자료형으로 선언시에는 자료형을 명시해야 된다.
    val exp00: String = "안녕하세요"
    val exp08: Byte = 126
    val exp10: Short = 32767


    println(exp08)
    println(exp10)

    println(Short.MAX_VALUE)
    println(Int.MAX_VALUE)
}