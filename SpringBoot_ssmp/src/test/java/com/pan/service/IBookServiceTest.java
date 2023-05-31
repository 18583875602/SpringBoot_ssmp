package com.pan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pan.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IBookServiceTest {

    @Autowired
    private IBookService IbookService;

    @Test
    void testGetById() {
        System.out.println(IbookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("test123");
        book.setName("test123");
        book.setDescription("123");
        book.setType("test123");
        System.out.println(IbookService.save(book));
    }


    @Test
    void testGetPage() {
        IPage<Book> page = IbookService.page(new Page<Book>(1,5));
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }
}
