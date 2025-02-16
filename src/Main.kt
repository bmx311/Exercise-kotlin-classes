//part 1
class Book {
    var title = ""
    var author = ""
    var yearPublished = 0
}

fun main() {
    val b1 = Book()
    b1.title = "Steel Ball Run"
    b1.author = "Hirohiko Araki"
    b1.yearPublished = 2004

    println(b1.title)
    println(b1.author)
    println(b1.yearPublished)
}