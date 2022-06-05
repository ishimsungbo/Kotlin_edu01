package chap05.section01

/**
 * 2022-06-05 클래스
 */

class Bird{ // 1. 클래스 정의
    // 2프로퍼티(속성)
    var name: String ="mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 3 메서드 함수
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int)= println("Sing vol: $vol")
}

fun main() {
    val coco = Bird()  // 객체생성
    coco.color = "blue"  // 프로퍼티에 값 할당

    println("coco.color: ${coco.color}")  // 객체의 멤버 프로퍼티 읽기
    coco.fly()
    coco.sing(3)
}