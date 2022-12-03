package com.itheima.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookDao bookDao ;

    @Override
    public boolean save(Book book) {
        bookDao.insert(book);
        return false;
    }

    @Override
    public boolean update(Book book) {
        bookDao.updateById(book);
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.deleteById(id);
        return false;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.selectById(id);
        return book;
    }

    @Override
    public List<Book> getList(Map<String, Object> param) {
        bookDao.selectList(null);
        return null;
    }

    @Override
    public IPage<Book> getPageList(Map<String, Object> param) {
        return null;
    }
}
