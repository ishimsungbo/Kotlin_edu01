package chap02.section2

// 20220530
//자료형에 별명 붙이기
typealias Username = String

fun main() {
    val num = 10
    var formattedString = """
        var a= 6
        var b = "Kotlin"
        println(a + num)
        """
    println(formattedString)

    val user: Username = "Kildong"

    println(user)
}


