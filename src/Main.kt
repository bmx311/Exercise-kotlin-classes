//part 2
class Book(var title:String, var author:String, var yearPublished:Int)

fun main() {
    val b1 = Book("Steel Ball Run", "Hirohiko Araki", 2004)
    print(getBookInfo(b1.title, b1.author, b1.yearPublished))
}

fun getBookInfo(bookTitle:String, bookAuthor:String, bookYearPublished:Int ):String {
    return "$bookTitle by $bookAuthor ($bookYearPublished)"
}