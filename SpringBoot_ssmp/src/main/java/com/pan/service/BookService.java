package com.pan.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pan.domain.Book;

import java.util.List;

public interface BookService {

    public abstract Boolean save(Book book);

    public abstract Boolean update(Book book);

    public abstract Boolean delete(Integer id);

    public abstract Book getById(Integer id);

    public abstract List<Book> getAll();

    public abstract IPage<Book> getPage(int currentPage,int pageSize);

}
