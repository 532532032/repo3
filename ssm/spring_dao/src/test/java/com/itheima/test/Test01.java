package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {


    @Test
    public void method() {
        ApplicationContext app=new ClassPathXmlApplicationContext("/spring/application-dao.xml");
        ItemsDao bean = app.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }
}
