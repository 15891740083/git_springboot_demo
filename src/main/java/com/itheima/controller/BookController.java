package com.itheima.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import com.itheima.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("ALL")//屏蔽警告
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    IBookService bookService;
    JSONObject json = new JSONObject();

    @GetMapping
    public Result getList(){
        List<Book> list = bookService.list();
        return new Result(true,list);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public Result getPageList(@PathVariable int currentPage ,@PathVariable int pageSize,Book book){
        IPage data = bookService.getPageList(currentPage,pageSize,book);
        if(currentPage>data.getPages()){
            data = bookService.getPageList((int)data.getPages(),pageSize,book);
        }

        return new Result(true,data);
    }


    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        Book book = bookService.getById(id);
        return new Result(true,book);
    }

    @PostMapping
    public Result save(@RequestBody Book book){
        boolean b = bookService.save(book);
        return new Result(b,null);
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        boolean b = bookService.updateById(book);
        return new Result(b,null);
    }

    @DeleteMapping("{id}")
    public Result deletById(@PathVariable Integer id){
        boolean b = bookService.removeById(id);
        return new Result(b,null);
    }
}
