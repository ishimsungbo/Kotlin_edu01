package chap02.section1

import com.example.edu02.Person as User   // 알리아스를 붙여서 클래스 명을 변경 가능

fun main() {
    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

}

class Person(val id: String, val name: String)