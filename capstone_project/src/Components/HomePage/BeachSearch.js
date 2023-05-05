import React, { useEffect, useState } from "react";
import BeachSearchCard from "./BeachSearchCard";

const BeachSearch = ({ beaches }) => {
    const [location, setLocation] = useState("");


    const filterNodes = beaches.map((beach) => {
      if (beach.location === location){
       return <BeachSearchCard beach={beach}/>
      }
      if (location === ""){
        return <BeachSearchCard key={beach.id} beach ={beach}/>
      }
    })

    const setFilter = (e) => {
        setLocation(e.target.value)
    }




    if (!filterNodes.length){return 'Loading'}

    return(
        <>
            <select onChange={setFilter}>
                <option value={""}>All</option>
                <option value="Arran">Arran</option>
                <option value="Berwickshire">Berwickshire</option>
                <option value="East-Lothian">East-Lothian</option>
                <option value="Lochaber">Lochaber</option>
            </select>

            {/* <button onClick={() => {filterBeach(location)}}>Search</button> */}

            {filterNodes}
        </>
    );
};

export default BeachSearch;