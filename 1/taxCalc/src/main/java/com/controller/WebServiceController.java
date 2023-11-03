package com.controller;

import javax.jws.WebService;

@WebService(name = "WebServiceController", // 暴露服务名称
        targetNamespace = "http://controller.com"// 命名空间,一般是接口的包名倒序
)
public interface WebServiceController {
    double calculateTax(double income);
}
