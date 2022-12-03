package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        Book book = bookDao.getById(11);
        System.out.println(book.toString());
    }
    @Test
     void save(){
        Book book = new Book();
        book.setName("11111");
        book.setType("222222");
        book.setDiscription("333333333");
        bookDao.insert(book);
    }

    @Test
    void update(){
        Book book = new Book();
        book.setName("11111");
        book.setType("222222");
        book.setDiscription("333333333");
        book.setId(11);
        bookDao.updateById(book);
    }

    @Test
    void delete(){
        bookDao.deleteById(124502019);
    }

    @Test
    void getAll(){
        bookDao.selectList(null);
    }

    @Test
    void getPageList(){
        //分页需要配置拦截器
        IPage page = new Page(2,10);
        page = bookDao.selectPage(page, null);
        System.out.println(page.toString());
    }

    //条件查询
    @Test
    void getByParam(){
        String name = null;
//        QueryWrapper<Book> qw = new QueryWrapper<Book>();
//        QueryWrapper<Book> name1 = qw.like("name", name);
//        bookDao.selectList(qw);
        //eq,gt,lt.....

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name!=null,Book::getName,name);
        bookDao.selectList(lqw);
    }
}
