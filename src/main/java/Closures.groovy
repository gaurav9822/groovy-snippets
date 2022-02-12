class Closures {
    static void main(String[] args) {
        def clos = { println('hello world') }
        clos.call()

        def paramClose = { param -> println("hello ${param}") }
        paramClose.call("world")

        def lst = [11, 12, 13, 14]
        lst.each { println it }
        println lst.find { it > 12 }
        println lst.findAll { it > 12 }
        println lst.any { it > 13 }
        println lst.every { it > 10 }
        def newList = lst.collect { it * 2 }
        newList.each { println it }


        def mp = ["TopicName": "Maps", "TopicDescription": "Methods in Maps"]
        mp.each { println it }
        mp.each { println(it.key + ' maps to ' + it.value) }

    }
}
