package chap05.section03.override

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //메서드
    fun fly() = println("Fly sing: $wing")
    open fun sing(vol: Int)=println("Sing vol: $vol") //오버라이딩 가능한 메서드
}

class Parrot(name: String,
             wing: Int = 2,
             beak: String,
             color: String,
             var language: String ="natural"):Bird(name, wing, beak, color){

    fun speak()=println("Speack! $language")

    override fun sing(vol: Int) {
        println("I', a parrot! the volume level is $vol")
        speak() //달라진 내용
    }
}

fun main() {
    val parrot = Parrot(name="myparrot", beak="short", color = "multiple")
    parrot.language="English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5) //달라진 메서드 기능 수행
}