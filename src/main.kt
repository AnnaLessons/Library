import data.Book
import data.OrderBook
import data.Person
import logic.Library

fun main() {

    val library: Library = Library()

    val book1: Book = Book("Война и мир", "Роман", Person("Лев"), 1830)
    val book2: Book = Book("Ася", "Роман", Person("Тургеньев"), 1890)

    library.books.addAll(listOf(book1, book2))

    val person1: Person = Person("Петя")
    val person2: Person = Person("Вася")

    library.addOrderBook(OrderBook(person1, "89462477432"))
    library.addOrderBook(OrderBook(person2, "89562877431"))

    library.getBook(book1, person1)
}