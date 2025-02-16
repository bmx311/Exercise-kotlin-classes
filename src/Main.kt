//part 2
class Book(var title:String, var author:String, var yearPublished:Int)

fun main() {
    val b1 = Book("Steel Ball Run", "Hirohiko Araki", 2004)

    println(b1.title)
    println(b1.author)
    println(b1.yearPublished)
}