package com.itheima.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImp extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    BookDao bookDao ;


    @Override
    public IPage getPageList(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        page = bookDao.selectPage(page, null);
        return page;
    }

    @Override
    public IPage getPageList(int currentPage, int pageSize, Book book) {
        IPage page = new Page(currentPage,pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(!Strings.isEmpty(book.getName()),Book::getName,book.getName());
        lqw.like(!Strings.isEmpty(book.getType()),Book::getType,book.getType());
        lqw.like(!Strings.isEmpty(book.getDiscription()),Book::getDiscription,book.getDiscription());
        page = bookDao.selectPage(page,lqw);
        return page;
    }
}
