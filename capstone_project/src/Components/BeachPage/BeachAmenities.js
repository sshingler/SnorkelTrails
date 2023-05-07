import React, { useState } from "react";
import parkImg from "../../Images/Amenities/parking.png"
import toiletImg from "../../Images/Amenities/toilet.png"
import shopImg from "../../Images/Amenities/store.png"
import campsiteImg from "../../Images/Amenities/campsite.png"
import stepsImg from "../../Images/Amenities/stairs.png"
import beachWheelchairsImg from "../../Images/Amenities/disabled.png"
import busStopImg from "../../Images/Amenities/bus-station.png"
import cafeImg from "../../Images/Amenities/coffee.png"

const BeachAmenities = ({ beachAmenities }) => {

    let parking = true
    let toilets = true
    let shop = true
    let cafe = true
    let campsite = true
    let steps = true
    let beachWheelchairs = true
    let busStop = true


    const amenities = beachAmenities.map(amenitie => amenitie);


    if(amenities.includes("Parking")){
        parking = false;
    }
    if(amenities.includes("Toilet")){
        toilets = false;
    }
    if(amenities.includes("Shop")){
        shop = false;
    }
    if(amenities.includes("Cafe")){
        cafe = false;
    }
    if(amenities.includes("Campsite")){
        campsite = false;
    }
    if(amenities.includes("Steps")){
        steps = false;
    }
    if(amenities.includes("Beach Wheelchair")){
        beachWheelchairs = false;
    }
    if(amenities.includes("Bus Stop")){
        busStop = false;
    }


    return (
        <>
            <div className="amenitiesicons">
                <img hidden={parking} src={parkImg} height="50" width="50"/>
                <img hidden={toilets} src={toiletImg} height="50" width="50"/>
                <img hidden={shop} src={shopImg} height="50" width="50"/>
                <img hidden={campsite} src={campsiteImg} height="50" width="50"/>
                <img hidden={steps} src={stepsImg} height="50" width="50"/>
                <img hidden={beachWheelchairs} src={beachWheelchairsImg} height="50" width="50"/>
                <img hidden={busStop} src={busStopImg} height="50" width="50"/>
                <img hidden={cafe} src={cafeImg} height="50" width="50"/>
            </div>
        </>
    );
};

export default BeachAmenities;