import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";
import '../StyleSheets/BeachPage/BeachContainer.css'

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
            <div className="beach-card">
                <p>Location: {beach.location}</p>
                <p>Name: {beach.name}</p>
                <img src={require("../Images/Beaches/" + beach.image)}></img>
                <p>Minimum temperature: {weather.daily.temperature_2m_min}'C</p>
                <p>What Three Words: {beach.w3w}</p>
                <p>Co-ordinates: {beach.map_cords}</p>
                <p>Nearest village: {beach.nearestVillage}</p>
                <p>Description: {beach.description}</p>
            </div>
        </>
    );
};

export default BeachContainer;