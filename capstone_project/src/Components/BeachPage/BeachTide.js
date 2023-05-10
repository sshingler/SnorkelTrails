import React, { useEffect, useState } from "react";


function BeachTide( {beach} ) {
  const [beachTide, setBeachTide] = useState();

  async function fetchTide() {
    const latlong = beach.longLat.split(',');
    const res = await fetch(`http://localhost:3000/tides/${latlong[0]}/${latlong[1]}`);
    const tide = await res.json();
    setBeachTide(tide);
}

useEffect(() => {
    fetchTide();
}, []);


if (!beachTide) return 'Loading'

const dateString = beachTide.data.next.datetime;
const date = new Date(dateString);
const formattedDateString = date.toLocaleString();

return(
  <>
  <div>
  <p className="current-height"><span style={{fontWeight:'bold'}}>Current height: </span>{beachTide.data.currentHeight} meters</p>
  <br/>
  <p className="next-height"><span style={{fontWeight:'bold'}}>Next height: </span>{beachTide.data.next.height} meters</p>
  <br/>
  <p className="tide-direction"><span style={{fontWeight:'bold'}}>Direction: </span>{beachTide.data.direction}</p> 
  <br/>
  <p className="next-tide"><span style={{fontWeight:'bold'}}>Tide change: </span>{formattedDateString}</p> 
  </div>
  </>
)

}

export default BeachTide;
