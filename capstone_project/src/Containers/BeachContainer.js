import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";

const BeachContainer = () => {
    const [weather, setWeather] = useState(false);


    const location = useLocation();
    const beach = location.state;

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

    return (
        <>
        <h1>
            {beach.name}
            {weather.daily.temperature_2m_min}
            {weather.latitude}
            {weather.longitude}
        </h1>
        </>
    );
};

export default BeachContainer;