package com.pan.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pan.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("test123");
        book.setName("test123");
        book.setDescription("123");
        book.setType("test123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {

    }

    @Test
    void testGetAll() {

    }

    @Test
    void testGetPage() {
        IPage page = new Page(2,4);
        bookDao.selectPage(page,null);

    }

    @Test
    void testGetBy() {
        String name = "Spring";
        LambdaQueryWrapper<Book> qlw = new LambdaQueryWrapper<>();
        qlw.like(name != null,Book::getName,name);
        bookDao.selectList(qlw);
    }
}
