import React, { useState, useEffect } from "react";

const BeachTidefail = () => {
    const [station, setStation] = useState();
    const [tide, setTide] = useState();

    const url = "https://api.tidestoday.io/v1/locations/nearby?lat=50.445936&lng=-3.550624&distance=25&unit=miles&lang=en";
    const apiKey = "d2000f3c0ee240c5bc9eb6280c6e95d0";

    fetch(url, {
    headers: {
        "Authorization": `Basic ${apiKey}`,
        "accept": "application/json",
        "mode": "no-cors"
    }
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));

    useEffect(() => {
        fetch(url);
    }, [])




    return(
        <>
        
        </>
    );
};

export default BeachTidefail;