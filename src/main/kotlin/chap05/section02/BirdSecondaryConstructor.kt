package chap05.section02

/**
 * 2022-06-05 클래스
 */

class Bird{ // 1. 클래스 정의
    // 2프로퍼티(속성)
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name  // this.name 은 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int)= println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue") //생성자의 인자로 객체 생성과 동시에 초기화

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}