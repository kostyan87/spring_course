package com.ignatev.aop;

import com.ignatev.aop.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We took book from School Library");
    }
}
