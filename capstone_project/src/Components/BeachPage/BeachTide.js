import { useState, useEffect } from "react";

const BeachTide = ({ beach }) => {
  const [tideData, setTideData] = useState(null);

  useEffect(() => {
    const latlong = beach.longLat.split(',')
    const fetchData = async () => {
      try {
        const response = await fetch(`https://api.tidesandcurrents.noaa.gov/api/prod/datagetter?date=latest&station=9432780&product=water_level&datum=MLLW&units=english&time_zone=lst_ldt&format=json&latitude=${latlong[0]}&longitude=${latlong[1]}`);
        const data = await response.json();
        setTideData(data);
      } catch (error) {
        console.error(error);
      }
    };
    fetchData();
  }, []);

  if (!tideData) {
    return <div>Loading...</div>;
  }

  return (
    <div>
      <h1>Tide Information for {tideData.metadata.name}</h1>
      <p>Latest observed water level: {tideData.data[0].v}</p>
      <p>Timestamp: {tideData.data[0].t}</p>
    </div>
  );
};

export default BeachTide;
