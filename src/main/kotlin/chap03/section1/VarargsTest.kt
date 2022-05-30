package chap03.section1

// 함수 인자를 동적으로 받고 싶다면...
// 가변 인자 Variable Argument
fun main() {

    nomalVarargs(1,2,3,4,5)
    println("-------------------")
    nomalVarargs(4,5,6)
    println("-------------------")

    stringArg("a","b","c","d")
}
fun nomalVarargs(vararg counts: Int){
    for (num in counts){
        println("$num")
    }
}

fun stringArg(vararg strs: String){
    for (strings in strs){
        println("$strings")
    }
}