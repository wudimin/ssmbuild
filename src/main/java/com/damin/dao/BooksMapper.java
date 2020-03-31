package com.damin.dao;

import com.damin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {

    //增加一本书
    public int addBook(Books books);

    //删除一本书
    public int deleteBook(@Param("bookId") int id);

    //更新一本书
    public int updateBook(Books books);

    //查询一本书
    public Books queryBook(@Param("bookId") int id);

    //查询全部书
    public List<Books> queryAllBook();
}