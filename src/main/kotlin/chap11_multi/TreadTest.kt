package chap11_multi

// 1. 쓰레드 상속받아 구현. (다중 상속이 안됨)
class SimpleThread: Thread(){
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}

//2. Runnable 인터페이스...
class SimpleRunnable: Runnable{
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}

fun main() {
 val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

}