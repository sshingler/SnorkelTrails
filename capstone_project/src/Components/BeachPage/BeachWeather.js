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
                        <p className="weather-time">Date: {reversedDate}</p>
                        <p className="weather-windspeed">Max windspeed: {weather.daily.windspeed_10m_max} Km/h</p>
                        <p className="weather-precipitationsum">Total precipitation 24hr: {weather.daily.precipitation_sum}mm</p>
                        <p className="weather-precipitation">Precipitation probability: {weather.daily.precipitation_probability_max}%</p>
                        <p className="weather-temprature">Minimum temprature: {weather.daily.temperature_2m_min}{'\u2103'}</p>
                    </div>

                </div>
            </div>
        </>
    );
};

export default BeachWeather;