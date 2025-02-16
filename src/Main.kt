//part 2
class Book(var title:String, var author:String, var yearPublished:Int, var genre:String)

fun main() {
    val b1 = Book("Steel Ball Run", "Hirohiko Araki", 2004, "Hard boiled, Fantasy")
    print(getBookInfo(b1.title, b1.author, b1.yearPublished, b1.genre))
}

fun getBookInfo(bookTitle:String, bookAuthor:String, bookYearPublished:Int, bookGenre:String ):String {
    return "$bookTitle by $bookAuthor ($bookYearPublished), genre: $bookGenre"
}