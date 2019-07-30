package logic

import data.Book
import data.OrderBook
import data.Person

class Library {

    private val orderBooks: MutableList<OrderBook> = mutableListOf()
    val books: MutableList<Book> = mutableListOf()

    fun addOrderBook(orderBook: OrderBook) {

        orderBooks.add(orderBook)
    }

    fun removeOrderBook(orderBook: OrderBook) {

        orderBooks.remove(orderBook)
    }

    fun getBook(book: Book, person: Person) {

        loop@for (tempOrderBook in orderBooks) {

            if (person == tempOrderBook.owner) {

                for (tempBook in books) {

                    if (tempBook == book) {

                        tempOrderBook.books.add(tempBook)
                        println("Книга взята")
                        break@loop
                    }
                }
            }
        }
    }
}
