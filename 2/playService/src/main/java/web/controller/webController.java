package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import web.entity.WeatherInfo;
import web.service.WeatherClient;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

@Controller
@ResponseBody
@RequestMapping("/webService")
public class webController {
    @Autowired
    WeatherClient weatherClient;

    @GetMapping("/Weather/{cityName}")
    public WeatherInfo getWeather(@PathVariable String cityName) throws Exception {
        return weatherClient.getWeatherInfo(cityName);
    }
}
