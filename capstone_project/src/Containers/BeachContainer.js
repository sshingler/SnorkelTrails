import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";
import '../StyleSheets/BeachPage/BeachContainer.css'
import SeaLifeCard from "../Components/SeaLife/SeaLifeCard";
import BeachWeather from "../Components/BeachPage/BeachWeather";
import BeachAmenities from "../Components/BeachPage/BeachAmenities";

const BeachContainer = () => {

    const location = useLocation();
    const beach = location.state;


    const creatureNodes = beach.creatureBeaches.map((creature) => {
        return <SeaLifeCard creature = {creature.creature}/>
    })


    return (
        <>
            <div className="beach-container">
                <div className="beach-card">
                    <p>Location: {beach.location}</p>
                    <p>Name: {beach.name}</p>
                    <img src={require("../Images/Beaches/" + beach.image)}></img>
                    <p>What Three Words: {beach.w3w}</p>
                    <p>Co-ordinates: {beach.map_cords}</p>
                    <p>Nearest village: {beach.nearestVillage}</p>
                    <p>Description: {beach.description}</p>
                </div>
                <br></br>
                <br></br>
                <BeachAmenities beachAmenities={beach.amenities}/>
                <br></br>
                <br></br>
                <div>
                    <BeachWeather beach = {beach}/>
                </div>
                    {creatureNodes}
            </div>
        </>
    );
};

export default BeachContainer;