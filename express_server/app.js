import fetch from 'node-fetch'
import express from 'express';
import * as dotenv from 'dotenv'


const app = express();

dotenv.config()

app.get('/tides/:lat/:long', function (req, res) {
    const url = `https://api.tidestoday.io/v1/locations/nearby?lat=${req.params.lat}&lng=${req.params.long}&distance=25&unit=miles&lang=en`;
    const apiKey = process.env.API_KEY;

    fetch(url, {
    headers: {
        "Authorization": `Basic ${apiKey}`,
        "accept": "application/json"
    }
    })
    .then(response => response.json())
    .then(data => {
        const url = `https://api.tidestoday.io/v1/locations/${data.data[0].id}/tides/now?lang=en`

        return fetch(url, {
            headers: {
                "Authorization": `Basic ${apiKey}`,
                "accept": "application/json"
            }
        })
    })
    .then(response => response.json())
    .then(data => res.json(data))
    .catch(error => console.error(error));
});

app.listen(3000, function () {
  console.log('App running on port 3000');
});