/**
 * 目标1：默认显示-北京市天气
 *  1.1 获取北京市天气数据
 *  1.2 数据展示到页面
 */
function getWeather(cityCode) {
    myAxios({
        url: 'http://hmajax.itheima.net/api/weather',
        params: {
            city: cityCode
        }
    }).then(result => {
        console.log(result)
        const wObj = result.data
        document.querySelector('.title').innerHTML = `
            <span class="dateShort">${wObj.dateShort}</span>
            <span class="calendar">农历&nbsp;
            <span class="dateLunar">${wObj.dateLunar}</span>
            </span>
        `
        document.querySelector('.area').innerHTML = wObj.area

        const nowStr = `
            <div class="tem-box">
            <span class="temp">
            <span class="temperature">${wObj.temperature}</span>
            <span>°</span>
            </span>
            </div>
            <div class="climate-box">
                <div class="air">
                <span class="psPm25">${wObj.psPm25}</span>
                <span class="psPm25Level">${wObj.psPm25Level}</span>
                </div>
                <ul class="weather-list">
                <li>
                    <img src="${wObj.weatherImg}" class="weatherImg" alt="">
                    <span class="weather">${wObj.weather}</span>
                </li>
                <li class="windDirection">${wObj.windDirection}</li>
                <li class="windPower">${wObj.windPower}</li>
                </ul>
            </div>
        `
        document.querySelector('.weather-box').innerHTML = nowStr

        // 今日温度
        // const todayStr = `
        //     <div class="range-box">
        //     <span>今天：</span>
        //     <span class="range">
        //     <span class="weather">晴</span>
        //     <span class="temNight">9</span>
        //     <span>-</span>
        //     <span class="temDay">14</span>
        //     <span>℃</span>
        //     </span>
        //     </div>
        //     <ul class="sun-list">
        //         <li>
        //         <span>紫外线</span>
        //         <span class="ultraviolet">强</span>
        //         </li>
        //         <li>
        //         <span>湿度</span>
        //         <span class="humidity">53</span>%
        //         </li>
        //         <li>
        //         <span>日出</span>
        //         <span class="sunriseTime">06:38</span>
        //         </li>
        //         <li>
        //         <span>日落</span>
        //         <span class="sunsetTime">17:18</span>
        //         </li>
        //     </ul>
        // `

        const todayObj = wObj.todayWeather
        Object.keys(todayObj).forEach(key => {
            document.querySelector(`.today-weather .${key}`).innerHTML = todayObj[key]
        })
        const dayForecastObj = wObj.dayForecast
        document.querySelectorAll('.week-wrap .item').forEach((item, index) => {
            Object.keys(dayForecastObj[index]).forEach(key => {
                item.querySelector(`.${key}`).innerHTML = dayForecastObj[index][key]
            }
            )
        })

        // const input = document.querySelector('.search-city')
        // input.addEventListener('input', () => {
        document.querySelector('.search-city').addEventListener('input', e => {
            myAxios({
                url: 'http://hmajax.itheima.net/api/weather/city',
                params: {
                    // city: input.value
                    city: e.target.value
                }
            }).then(result => {
                console.log(result);
                document.querySelector('.search-list').innerHTML = result.data.map(item => `
                <li class="city-item" data-code="${item.code}">${item.name}</li>
                `).join('')
                document.querySelector('.search-list').addEventListener('click', e => {
                    if (e.target.classList.contains("city-item")) {
                        // console.log();
                        getWeather(e.target.dataset.code)
                    }
                })
            })
        })
    })

}

getWeather('110100')