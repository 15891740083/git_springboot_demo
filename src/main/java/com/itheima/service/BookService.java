package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    public boolean save(Book book);
    public boolean update(Book book);
    public boolean delete(Integer id);
    public Book getById(Integer id);
    public List<Book> getList(Map<String,Object> param);
    public IPage<Book> getPageList(Map<String,Object> param);
}
