import React, { useEffect, useState } from "react";
import BeachSearchCard from "./BeachSearchCard";

const BeachSearch = ({ beaches }) => {
    const [location, setLocation] = useState("");
    const [amenities, setAmenities] = useState([]);
    const [parking, setParking] = useState(false)

    console.log(amenities);

    const filterNodes = beaches.map((beach) => {
      if (beach.location === location){
        if (amenities.length !== 0){
            console.log('kinda got it');
            if (beach.amenities.some(beach => beach.includes(amenities))){
                console.log('got it');
                return <BeachSearchCard key={beach.id} beach={beach}/>
            }
        } else return console.log('not got it'), <BeachSearchCard key={beach.id} beach={beach}/>
      }
      if (location === ""){
        if (amenities.length !== 0){
            console.log('kinda got it');
            if (beach.amenities.some(beach => beach.includes(amenities))){
                console.log('got it', amenities);
                return <BeachSearchCard key={beach.id} beach={beach}/>
            }
        } else return console.log('not got it'), <BeachSearchCard key={beach.id} beach={beach}/>
      }
    });

    const setFilter = (e) => {
        setLocation(e.target.value)
    }

    const test = (e) => {
        console.log(e.target.checked);
        if (e.target.checked === true) {
            if (e.target.value === "Toilet"){
                setAmenities([...amenities, e.target.value])
                console.log(amenities);
            } else return console.log('pfffffffffffff');
        } else {
            let temp = [...amenities]
            temp.pop(e.target.value)
            setAmenities(temp)
            return console.log('pop'), console.log(amenities);
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

            <label htmlFor="all">all</label>
            <input onChange={test} type="checkbox" id="all" name="all" value="all"/>

            <label htmlFor="toilets">toilets</label>
            <input onChange={test} type="checkbox" id="toilets" name="toilets" value="Toilet"/>

            {/* <button onClick={() => {filterBeach(location)}}>Search</button> */}
            <div className="beach-scroll-card">
            {filterNodes}
            </div>
        </>
    );
};

export default BeachSearch;