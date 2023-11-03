package com.controller;

import com.service.taxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@ResponseBody
public class useWebServiceController {
    @Autowired
    private taxService taxService;
    @GetMapping("/useTax/{income}")
    public double useService(@PathVariable double income) {
        return taxService.taxCalc(income);
    }

}
