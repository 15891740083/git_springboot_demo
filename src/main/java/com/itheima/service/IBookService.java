package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

public interface IBookService extends IService<Book> {

    IPage getPageList(int currentPage, int pageSize);

    IPage getPageList(int pages, int pageSize, Book book);
}
