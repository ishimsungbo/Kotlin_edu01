package chap03.section3

//변수에 할당하는 람다식 함수 작성하기
fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y} //일반 변수에 람다식 적용
    result = multi(10,20)
    println(result)


}