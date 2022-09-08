/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.formatter;

import com.btl.pojo.Category;
import java.text.ParseException;
import java.util.Locale;
import static org.graalvm.compiler.core.common.type.StampFactory.object;
import org.springframework.format.Formatter;


/**
 *
 * @author Lọt
 */
public class CategoryFormatter implements Formatter<Category>{

    @Override
    public String print(Category object, Locale locale) {
        return String.valueOf(object.getId());
    }

    @Override
    public Category parse(String catId, Locale locale) throws ParseException {
        Category c = new Category();
        c.setId(Integer.parseInt(catId));
        
        return c;
    }
    
}
