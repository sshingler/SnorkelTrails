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


  return(
    <>
    <div>
      {beachTide.data.currentHeight}
    </div>
    </>
  )

}

export default BeachTide;
