import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";
import '../StyleSheets/BeachPage/BeachContainer.css'
import SeaLifeCard from "../Components/SeaLife/SeaLifeCard";
import BeachWeather from "../Components/BeachPage/BeachWeather";
import BeachAmenities from "../Components/BeachPage/BeachAmenities";
import BeachTide from "../Components/BeachPage/BeachTide";

const BeachContainer = () => {

    const location = useLocation();
    const beach = location.state;


    const creatureNodes = beach.creatureBeaches.map((creature) => {
        return <SeaLifeCard key={creature.id} creature = {creature.creature}/>
    })

    console.log(beach.image);

    return (
        <>
            <div className="beach-container">

              

                <div className="beach-title">
                    <h1>{beach.name}</h1>
                </div>

                <div className="beach-img">
                    <img src={require("../Images/Beaches/" + beach.image)} alt="Image of a beach" />
                </div>

                <div className="beach-weather-info">
                    <div className="beach-weather">
                        <BeachWeather beach = {beach}/>
                        <BeachTide/>
                    </div>

                    <div className="beach-tide">
                        
                    </div>
                </div>

                <div className="beach-description">
                    <div className="amenities">
                        <BeachAmenities beachAmenities={beach.amenities}/>
                    </div>

                    <div className="description">
                        {beach.description}
                    </div>
                </div>


                <div className="beach-creatures">
                    {creatureNodes}
                </div>
            </div>
        </>
    );
};

export default BeachContainer;