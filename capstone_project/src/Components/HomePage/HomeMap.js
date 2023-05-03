import React from "react";
import { MapContainer, TileLayer, useMap, Marker, Popup } from "react-leaflet";

import '../../StyleSheets/HomePage/HomeMap.css'
import 'leaflet/dist/leaflet.css'

const HomeMap = () => {




    return (
        <>
            <div id="map">
                <MapContainer center={[57.4836744,-4.5170531]} zoom={7}>
                    <TileLayer 
                        attribution= '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>contributors'
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                        <Marker position={[56.7530473,-4.4950804]}>
                            <Popup>
                                A pretty CSS3 popup. <br /> Easily customizable.
                                <a href="/sealife">sealife</a>
                            </Popup>
                        </Marker>
                </MapContainer>
            </div>

        </>
    );
};

export default HomeMap;