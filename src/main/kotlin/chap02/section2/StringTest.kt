package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    //내가 해보기

    if(str1.equals(str3)){
        println("true")
    }else{
        println("false")
    }

}