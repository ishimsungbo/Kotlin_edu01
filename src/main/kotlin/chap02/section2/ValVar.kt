package chap02.section2

fun main() {
    val number = 10  //number 변수는 Int 형으로 추론
    var language = "Korean" //language 변수는 String 으로 추론
    val secondNumber: Int = 20 //명시적
    language = "English"  //var 키워드로 선언한 변수는 값을 다시 할당할 수 있음

    // number = 20 //Kotlin: Val cannot be reassigned 이란 메세지가 뜬다. val 불변형으로 선언 했기 때문이다.

    println("number : $number")
    println("language : $language")
    println("secondNumber : $secondNumber")
}