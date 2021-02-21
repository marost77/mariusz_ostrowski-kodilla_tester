package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook(){
        BookDto bookDto = Mockito.mock(BookDto.class);
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);

        List<BookDto> booksList = new ArrayList<>();
        bookController.addBook(bookDto);


        //when
       // List<BookDto> result = Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList).getMock();
        BookDto result = bookController.getBooks();
        //then
        //Mockito.verify(bookController.getBooks()).get(bookDto));
        Assertions.assertThat(bookController.getBooks()).hasSize(1);
    }


}