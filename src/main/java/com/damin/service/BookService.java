package com.damin.service;

import com.damin.pojo.Books;
import java.util.List;
/*
 * 业务层
 */
public interface BookService {
    //增加一本书
    public int addBook(Books books);

    //删除一本书
    public int deleteBook(int id);

    //更新一本书
    public int updateBook(Books books);

    //查询一本书
    public Books queryBook(int id);

    //查询全部书
    public List<Books> queryAllBook();
}