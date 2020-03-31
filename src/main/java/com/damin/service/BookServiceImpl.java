package com.damin.service;

import com.damin.dao.BooksMapper;
import com.damin.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //servlet调dao层：组合dao
    private BooksMapper booksMapper;
    //写个set方法，让spring注入用
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return booksMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    public Books queryBook(int id) {
        return booksMapper.queryBook(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}