package com.pan.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pan.config.utils.R;
import com.pan.domain.Book;
import com.pan.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {
    /*@Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return iBookService.save(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return iBookService.removeById(id);
    }


    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return iBookService.getById(id);
    }


    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize) {
        return iBookService.getPage(currentPage,pageSize);
    }*/

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public R getAll() {
        return new R(true,iBookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        /*R r = new R();
        boolean flag = iBookService.save(book);
        r.setFlag(flag);*/
        return new R(iBookService.save(book));
    }


    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(iBookService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(iBookService.removeById(id));
    }


    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,iBookService.getById(id));
    }


    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book) {
        IPage<Book> page = iBookService.getPage(currentPage,pageSize,book);

        if (currentPage > page.getPages()) {
            page = iBookService.getPage(currentPage,pageSize,book);
        }
        return new R(true,page);
    }
}
