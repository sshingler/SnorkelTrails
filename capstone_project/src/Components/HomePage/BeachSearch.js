import React, { useEffect, useState } from "react";
import BeachSearchCard from "./BeachSearchCard";

const BeachSearch = ({ beaches }) => {
    const [location, setLocation] = useState("");
    const [amenities, setAmenities] = useState([]);
    const [parking, setParking] = useState(false)


    const filterNodes = beaches.map((beach) => {
      if (beach.location === location){
        if (beach.amenities.includes(amenities)){
            return <BeachSearchCard beach={beach}/>
        } else return <BeachSearchCard beach={beach}/>

      }
      if (location === ""){
        return <BeachSearchCard key={beach.id} beach ={beach}/>
      }
    });

    const setFilter = (e) => {
        setLocation(e.target.value)
    }

    const test = (e) => {
        if (e.target.value === "parking"){
            
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

            <label htmlFor="parking">parking</label>
            <input type="checkbox" id="parking" name="parking" value="parking"/>

            {/* <button onClick={() => {filterBeach(location)}}>Search</button> */}
            <div className="beach-scroll-card">
            {filterNodes}
            </div>
        </>
    );
};

export default BeachSearch;