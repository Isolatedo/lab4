package web.service;


import java.io.StringWriter;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.MessageElement;
import org.apache.axis.types.Schema;
import org.springframework.stereotype.Component;
import org.w3c.dom.Node;
import web.entity.WeatherInfo;

@Component
public class WeatherClient {

    private static final String WEATHER_ENDPOINT = "http://ws.webxml.com.cn/WebServices/WeatherWebService.asmx";

    public WeatherInfo getWeatherInfo(String cityName) throws Exception {
        String theRegionCode = "31124";

        String endpoint = "http://www.webxml.com.cn/WebServices/WeatherWS.asmx";

        Service service = new Service();

        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL(endpoint));

        call.setOperationName(new QName("http://WebXml.com.cn/",
                "getSupportCityDataset"));


        call.addParameter(new QName("http://WebXml.com.cn/","theRegionCode"),org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);

//        call.setReturnType(org.apache.axis.encoding.XMLType.XSD_SCHEMA);
        call.setReturnType(org.apache.axis.encoding.XMLType.XSD_SCHEMA);
        call.setUseSOAPAction(true);
        call.setSOAPActionURI("http://WebXml.com.cn/getSupportCityDataset");

        Schema result = (Schema)call.invoke(new Object[]{"31124"});

        // 假设result是一个Schema对象
        StringBuilder sb = new StringBuilder();
        sb.append(result.get_any());
        return null;
    }

    private WeatherInfo parseWeatherInfo(String[] result) throws RemoteException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WeatherInfo.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            // 将返回结果转换为XML格式字符串
            String xmlData = "<WeatherInfo>" + String.join("", result) + "</WeatherInfo>";
            WeatherInfo weatherInfo = (WeatherInfo) unmarshaller.unmarshal(new java.io.StringReader(xmlData));

            return weatherInfo;
        } catch (Exception e) {
            throw new RemoteException("解析天气数据出错：" + e.getMessage());
        }
    }

}

