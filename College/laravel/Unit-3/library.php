<?php

class Book {
    public function __construct(
        public string $title,
        public string $author,
        public int $year
    ){}
}

class Library implements IteratorAggregate {
    private array $books = [];

    public function addBook(Book $book): void {
        $this->books[] = $book;
    }

    public function getIterator(): Traversable {
        return new ArrayIterator($this->books);
    }
}

$library = new Library();

$library->addBook(new Book('The Great Gatsby', 'F. Scott Fitzgerald', 1925));
$library->addBook(new Book('1984', 'George Orwell', 1949));
$library->addBook(new Book('To Kill a Mockingbird', 'Harper Lee', 1960));

foreach ($library as $book) {
    echo "Title: {$book->title}<br>";
    echo "Author: {$book->author}<br>";
    echo "Year: {$book->year}<br><br>";
}

?>