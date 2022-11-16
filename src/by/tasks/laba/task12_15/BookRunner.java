package by.adamovichhh.laba.task12_15;

import java.util.*;

public class BookRunner {
    public static void main(String[] args) {
        Collection<Book> books = Set.of(
                new Book("Мастер и Маргарита", "Булгаков", 10, 5),
                new Book("Алые паруса", "Грин", 40, 7),
                new Book("Отцы и Дети", "Тургенев", 30, 7),
                new Book("Горе от ума", "Грибоедов", 80, 4),
                new Book("Ася", "Тургенев", 70, 10));
        SortedSet<Book> bookSortedSet = new TreeSet<>(books);
        System.out.println(bookSortedSet);
        List<Book> bookList = new ArrayList<>(books);
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor);
        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle);
        Comparator<Book> authorTitlePriceComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice);
        bookList.sort(titleComparator);
        System.out.println(bookList);
        bookList.sort(titleAuthorComparator);
        System.out.println(bookList);
        bookList.sort(authorTitleComparator);
        System.out.println(bookList);
        bookList.sort(authorTitlePriceComparator);
        System.out.println(bookList);
    }
}
