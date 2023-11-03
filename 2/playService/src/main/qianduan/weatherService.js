function getWeather() {
    var city = document.getElementById("city").value;

    // 构建API请求URL
    var apiUrl = "http://localhost:8080/webService/Weather/" + city;

    // 发起GET请求获取天气信息
    fetch(apiUrl)
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            displayWeather(data);
        })
        .catch(function(error) {
            console.log(error);
        });
}

function displayWeather(data) {
    var weatherInfoDiv = document.getElementById("weatherInfo");
    weatherInfoDiv.innerHTML = "";

    var location = data.location.name + ", " + data.location.country;
    var tempC = data.current.temp_c;
    var condition = data.current.condition.text;
    var humidity = data.current.humidity;

    var locationElement = document.createElement("p");
    locationElement.innerText = "地点: " + location;
    weatherInfoDiv.appendChild(locationElement);

    var temperatureElement = document.createElement("p");
    temperatureElement.innerText = "温度: " + tempC + "°C";
    weatherInfoDiv.appendChild(temperatureElement);

    var conditionElement = document.createElement("p");
    conditionElement.innerText = "天气状况: " + condition;
    weatherInfoDiv.appendChild(conditionElement);

    var humidityElement = document.createElement("p");
    humidityElement.innerText = "湿度: " + humidity + "%";
    weatherInfoDiv.appendChild(humidityElement);
}