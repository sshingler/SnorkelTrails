import React, { useEffect, useState } from "react";
import BeachSearchCard from "./BeachSearchCard";
import Toilet from '../../Images/Amenities/toilet.png';
import Cafe from '../../Images/Amenities/coffee.png';
import Store from '../../Images/Amenities/store.png';
import Campsite from '../../Images/Amenities/campsite.png';
import Steps from '../../Images/Amenities/stairs.png';
import WheelChair from '../../Images/Amenities/disabled.png';
import BusStop from '../../Images/Amenities/bus-station.png';

import '../../StyleSheets/BeachPage/BeachSearchCard.css'



const BeachSearch = ({ beaches }) => {
    const [location, setLocation] = useState("");
    const [amenities, setAmenities] = useState([]);


    const filterNodes = beaches.map((beach) => {
      if (beach.location === location){
        if (amenities.length !== 0){
            if (amenities.every((amenity) => beach.amenities.includes(amenity))){
                return <BeachSearchCard key={beach.id} beach={beach}/>
            }
        } else return <BeachSearchCard key={beach.id} beach={beach}/>
      }
      if (location === ""){
        if (amenities.length !== 0){
            if (amenities.every((amenity) => beach.amenities.includes(amenity))){
                return <BeachSearchCard key={beach.id} beach={beach}/>
            }
        } else return <BeachSearchCard key={beach.id} beach={beach}/>
      }
    });

    const setFilter = (e) => {
        setLocation(e.target.value)
    }

    const filterAmenities = (e) => {
        if (e.target.checked) {
            if (e.target.value === "Toilet"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Cafe"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Shop"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Campsite"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Steps"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Wheelchair"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }

        if (e.target.checked === true) {
            if (e.target.value === "Bus Stop"){
                setAmenities([...amenities, e.target.value])
            }
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
        }
    }



    if (!filterNodes.length){return 'Loading'}

    return(
        <>
        <div className="beach-search-card">
            <div className="beachsearch-selector">
                <select className="classic" onChange={setFilter}>
                    <option value={""}>All Locations</option>
                    <option value="Arran">Arran</option>
                    <option value="Berwickshire">Berwickshire</option>
                    <option value="East-Lothian">East-Lothian</option>
                    <option value="Lochaber">Lochaber</option>
                    <option value="North Argyll">North-Argyll</option>
                    <option value="North West Highlands">North-West Highlands</option>
                </select>
            </div>

            <div className="search-amenities">
                <div className="icon">
                <label htmlFor="toilets"><img src={Toilet} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Toilet icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="toilets" name="toilets" value="Toilet"/>
                </div>

                <div className="icon">
                <label htmlFor="cafe"><img src={Cafe} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Cafe icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="cafe" name="cafe" value="Cafe"/>
                </div>

                <div className="icon">
                <label htmlFor="shop"><img src={Store} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Store icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="shop" name="shop" value="Shop"/>
                </div>

                <div className="icon">
                <label htmlFor="campsite"><img src={Campsite} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Campsite icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="campsite" name="campsite" value="Campsite"/>
                </div>

                <div className="icon">
                <label htmlFor="steps"><img src={Steps} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Steps icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="steps" name="steps" value="Steps"/>
                </div>

                <div className="icon">
                <label htmlFor="wheelcahir"><img src={WheelChair} style={{height: 50 + 'px', width: 50 + 'px'}} alt="WheelChair icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="wheelcahir" name="wheelchair" value="Wheelchair"/>
                </div>

                <div className="icon">
                <label htmlFor="busStop"><img src={BusStop} style={{height: 50 + 'px', width: 50 + 'px'}} alt="Bus Stop icon"/></label>
                <input onChange={filterAmenities} type="checkbox" id="busStop" name="busStop" value="Bus Stop"/>
                </div>
            </div>

            {/* <button onClick={() => {filterBeach(location)}}>Search</button> */}
            <div className="beach-scroll-card">
            {filterNodes}
            </div>
        </div>
        </>
    );
};

export default BeachSearch;