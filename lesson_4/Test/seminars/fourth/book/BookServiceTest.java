package seminars.fourth.book;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testFindById(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book = new Book("1");
        when(bookRepository.findById("1")).thenReturn(book);
        assertEquals(book, bookService.findBookById("1"));
        verify(bookRepository, times(1)).findById("1");


    }

    @Test
    void testFindAllBooks(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        List<Book> list = new ArrayList<>();
        Book book = new Book("1");
        Book book2 = new Book("2");
        list.add(book);
        list.add(book2);
        when(bookRepository.findAll()).thenReturn(list);

        assertEquals(list, bookService.findAllBooks());
        verify(bookRepository, times(1)).findAll();




    }

}