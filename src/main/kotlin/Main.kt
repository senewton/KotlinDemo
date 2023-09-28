fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    doSomething()
    doMore(args)
    var arr = mutableListOf<String>("Apple", "Orange", "Pear", "Cucumber")
    var arr2 = mutableListOf<String>()
    doSomethingWith(arr)
    doSomethingElse(arr)
    doSomethingElse(arr2)
}

fun doSomething(){
    val s = "I did something"
    println(s)
}

fun doMore(x: Array<String>){
    println("First Item: " + x[0])
    println("Second Item: " + x[1])

    for (a in x) {
        println(a)
    }
}

fun doSomethingWith(fnArr: MutableList<String>){
    fnArr += "Tomato"
    fnArr[0] = "Gooseberry"
    for(element in fnArr){
        println("A: $element")
    }
}

fun doSomethingElse(fnArr: MutableList<String>){
    for(element in fnArr){
        println("B: $element")
    }
}