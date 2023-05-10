import React, { useEffect, useState } from "react";

const BeachWeather = ({ beach }) => {
    const [weather, setWeather] = useState(false);


    let beachLong = beach.longLat.split(",");
    let lat = parseFloat(beachLong[0])
    let long = parseFloat(beachLong[1])



    async function fetchWeater() {
        const res = await fetch(`https://api.open-meteo.com/v1/forecast?latitude=${lat}&longitude=${long}&daily=temperature_2m_min,precipitation_sum,precipitation_hours,precipitation_probability_max,windspeed_10m_max,winddirection_10m_dominant&forecast_days=1&timezone=auto`);
        const weather = await res.json();
        setWeather(weather);
    }

    useEffect(() => {
        fetchWeater();
    }, []);

    if (weather === false){
        return "Loading"
    }

    let reversedDate = weather.daily.time[0].split('-').reverse().join("-")

    return (
        <>
            <div className="weather-display">
                <div className="weather-border">
                    <div className="weather-front">
                        <p className="weather-time"><span style={{fontWeight:'bold'}}>Date:</span> {reversedDate}</p>
                        <br/>
                        <p className="weather-windspeed"><span style={{fontWeight:'bold'}}>Max windspeed:</span> {weather.daily.windspeed_10m_max} Km/h</p>
                        <br/>
                        <p className="weather-precipitationsum"><span style={{fontWeight:'bold'}}>Total precipitation 24hr:</span> {weather.daily.precipitation_sum}mm</p>
                        <br/>
                        <p className="weather-precipitation"><span style={{fontWeight:'bold'}}>Precipitation probability:</span> {weather.daily.precipitation_probability_max}%</p>
                        <br/>
                        <p className="weather-temprature"><span style={{fontWeight:'bold'}}>Minimum temprature:</span> {weather.daily.temperature_2m_min}{'\u2103'}</p>
                    </div>

                </div>
            </div>
        </>
    );
};

export default BeachWeather;