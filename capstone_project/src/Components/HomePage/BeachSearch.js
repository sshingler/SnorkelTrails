import React, { useEffect, useState } from "react";
import BeachSearchCard from "./BeachSearchCard";

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
            <div className="beachsearch-selector">
                <select onChange={setFilter}>
                    <option value={""}>All</option>
                    <option value="Arran">Arran</option>
                    <option value="Berwickshire">Berwickshire</option>
                    <option value="East-Lothian">East-Lothian</option>
                    <option value="Lochaber">Lochaber</option>
                    <option value="North Argyll">North-Argyll</option>
                </select>
            </div>

            <label htmlFor="toilets">Toilets</label>
            <input onChange={filterAmenities} type="checkbox" id="toilets" name="toilets" value="Toilet"/>

            <label htmlFor="cafe">Cafe</label>
            <input onChange={filterAmenities} type="checkbox" id="cafe" name="cafe" value="Cafe"/>

            <label htmlFor="shop">Shop</label>
            <input onChange={filterAmenities} type="checkbox" id="shop" name="shop" value="Shop"/>

            <label htmlFor="campsite">Campsite</label>
            <input onChange={filterAmenities} type="checkbox" id="campsite" name="campsite" value="Campsite"/>

            <label htmlFor="steps">Steps</label>
            <input onChange={filterAmenities} type="checkbox" id="steps" name="steps" value="Steps"/>

            <label htmlFor="wheelcahir">Wheelchair Access</label>
            <input onChange={filterAmenities} type="checkbox" id="wheelcahir" name="wheelchair" value="Wheelchair"/>

            <label htmlFor="busStop">Bus Stop</label>
            <input onChange={filterAmenities} type="checkbox" id="busStop" name="busStop" value="Bus Stop"/>

            {/* <button onClick={() => {filterBeach(location)}}>Search</button> */}
            <div className="beach-scroll-card">
            {filterNodes}
            </div>
        </>
    );
};

export default BeachSearch;