package com.controller;

import com.Service.CalculatorService;

import javax.jws.WebService;

@WebService(serviceName = "WebServiceController", // 与接口中指定的name一致
        targetNamespace = "http://controller.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.controller.WebServiceController"// 接口地址
)
public class WebServiceControllerImpl implements WebServiceController{
    @Override
    public double calculateTax(double income) {
        return CalculatorService.calculate(income);
    }
}
