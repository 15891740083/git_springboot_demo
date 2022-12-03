package com.itheima.nosql;

import com.itheima.domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yutong
 * @Description
 * @date 2022年12月02日 16:09
 */
@SpringBootTest
public class MongoDbTest {
    @Resource
    private MongoTemplate mongoTemplate;


    @BeforeEach
    void begin(){
        System.out.println("开始");
    }
    @AfterEach
    void end(){
            System.out.println("结束");
    }
    @Test
    void testGet(){
        List<Book> all = mongoTemplate.findAll(Book.class);
        System.out.println(all);
    }
    @Test
    void testSet(){
        Book book = new Book();
        book.setId (1);
        book.setType("java");
        book.setName("Sring全家桶");
        book.setDiscription("测试");
        mongoTemplate.save(book);
    }




}
