package com.ilkayaktas.springexperiment.controller;

import com.ilkayaktas.springexperiment.model.Item;
import com.ilkayaktas.springexperiment.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iaktas on 18.01.2019 at 14:44.
 */

@RestController
public class WebController {

    private Item item;
    private Model model;

    public WebController(Item item){ // WebController Spring tarafından oluşturulurken bu constructor çağrılıyor. Item otomatik inject ediliyor.
        this.item = item;
    }

    @Autowired
    public void setModel(Model model) {
        this.model = model;
    }

    @RequestMapping(value = "/")
    public String getSomething(){
        item.getName();
        System.out.println(item.out() + " " + model.out());
        return item.out() + " " +model.out();
    }
}
