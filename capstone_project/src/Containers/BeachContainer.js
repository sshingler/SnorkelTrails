import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";
import '../StyleSheets/BeachPage/BeachContainer.css'
import SeaLifeCard from "../Components/SeaLife/SeaLifeCard";
import BeachWeather from "../Components/BeachPage/BeachWeather";
import BeachAmenities from "../Components/BeachPage/BeachAmenities";
import BeachTide from "../Components/BeachPage/BeachTide";
import logo from '../Images/logo.png';
import BeachMap from "../Components/BeachPage/BeachMap";

const BeachContainer = () => {

    const location = useLocation();
    const beach = location.state;

    


    const creatureNodes = beach.creatureBeaches.map((creature) => {
        return <SeaLifeCard key={creature.id} creature = {creature.creature}/>
    })

    console.log(beach.image);

    return (
        <>

            <div className="logo-div">
                <img className="logo" src={logo} />
            </div>

            <div className="beach-container">

                <div className="header">
                    <div className="beach-title">
                        <h1>{beach.name}</h1>
                    </div>
                    <div className="title-amenities">
                        <BeachAmenities beachAmenities={beach.amenities}/>
                    </div>
                </div>

                <div className="beach-img">
                    <div className="beach-map-img">
                        <img className="map-img" src={require("../Images/Beaches/" + beach.image)} alt="Image of a beach" />
                    </div>
                    <div className="beach-map">
                        <BeachMap beach = {beach}/>
                    </div>
                </div>

                <div className="beach-description">
                    <div className="description">
                        {beach.description}
                    </div>
                </div>

                <div className="conditions">
                    <div className="beach-weather-info">
                        <h2 style={{textAlign: 'center', textDecoration: 'underline', fontSize: '2em', marginBottom: '1em'}}>Weather</h2>
                        <div className="beach-weather">
                            <BeachWeather beach = {beach}/>
                            
                        </div>
                    </div>

                    <div className="beach-tide-info">
                        <h2 style={{textAlign: 'center', textDecoration: 'underline', fontSize: '2em', marginBottom: '1em'}}>Tides</h2>
                        <div className="beach-tide">
                            <BeachTide beach={beach}/>
                        </div>
                    </div>
                </div>



                <div className="sea-life-title">
                    <h1>Sea Life at this Location</h1>
                </div>
                <div className="beach-creatures">
                    {creatureNodes}
                </div>

                <br/>
                <br/>
            </div>
          
        </>
    );
};

export default BeachContainer;