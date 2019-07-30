package data

data class OrderBook(val owner: Person,
                     val phoneNumber: String,
                     val books: MutableList<Book> = mutableListOf())