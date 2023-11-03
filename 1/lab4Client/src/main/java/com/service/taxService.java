package com.service;

import mycode.com.controller.WebServiceController_Service;
import org.springframework.stereotype.Service;

@Service
public class taxService {
    public double taxCalc(double income) {
        WebServiceController_Service service = new WebServiceController_Service();
        return service.getWebServiceControllerImplPort().calculateTax(income);
    }
}
