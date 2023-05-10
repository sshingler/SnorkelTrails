import React from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";
import ResetViewControl from '@20tab/react-leaflet-resetview';
import '../../StyleSheets/BeachPage/BeachMap.css'
import 'leaflet/dist/leaflet.css'
import { Icon } from "leaflet";
import MarkerClusterGroup from "react-leaflet-cluster";


const BeachMap = ({ beach }) => {

    const latlong = beach.longLat.split(',')

    const customIcon = new Icon({
        iconUrl: require("../../Images/MapIcons/redIcon.png"),
        iconSize: [38, 38]
    })



    return (
        <>
            <div id="beach-map" >
                <MapContainer center={[latlong[0],latlong[1]]} zoom={13}>
                    <TileLayer 
                        attribution= '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    <MarkerClusterGroup>
                        <Marker position={[latlong[0], latlong[1]]} icon={customIcon}>
                            <Popup >
                                {beach.name}
                            </Popup>
                        </Marker>
                    </MarkerClusterGroup>
                    <ResetViewControl
                        title="Reset view"
                        icon = {'\&#7360'}
                    />
                </MapContainer>
            </div>

        </>
    );
};

export default BeachMap;