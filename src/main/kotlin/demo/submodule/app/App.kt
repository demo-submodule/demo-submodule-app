package demo.submodule.app

class App {

    val lib: demo.submodule.lib.Library = demo.submodule.lib.Library()
    val svc1: demo.submodule.svc1.Library = demo.submodule.svc1.Library()
    val svc2: demo.submodule.svc2.Library = demo.submodule.svc2.Library()

    fun hello() {
        println(lib.hello("LIB"))
        println(svc1.hello("SVC1"))
        println(svc2.hello("SVC2"))
    }

}

fun main(args: Array<String>) {
    App().hello()
}
