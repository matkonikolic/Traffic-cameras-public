# Website for informing road traffic participants
All commits have been lost because the original repository was deleted.

This project was done as a part of Project-R course at the Faculty of electrical engineering and computing, academic year 2022/23, in collaboration with colleagues Karlo Žižić and Valentino Janda. 

## Task
Create a web portal of incoming traffic information that is displayed in real time. In a certain region or in the entire Republic of Croatia, it is necessary to visualize one type of data available through the Croatian national access point, using the Datex II protocol.

In our project we chose to implement display of live images from traffic cameras.

## Architecture
Frontend part was done using Leaflet with some changes to HTML and CSS.  

The web application backend consists of two parts: 
- Node.js server responsible for fetching data from the Tomcat server and displaying data on the map
- Tomcat server responsible for fetching data from the Croatian national access point 
in Datex II format and serving the data in geoJSON format

<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Traffic-cameras-public/assets/108575954/74b4708b-a6c0-4510-9148-b9985e53a438">
</p>

# Final product
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Traffic-cameras-public/assets/108575954/6a146988-fc5a-47b6-b10f-0c62383df075">
</p>
<h2 align="center">Default view upon opening the web page</h1>
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Traffic-cameras-public/assets/108575954/db60e977-4253-44e2-bf49-79af59f532cb">
</p>
<h2 align="center">Zoomed in view</h1>
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Traffic-cameras-public/assets/108575954/6c692980-0547-416c-8d35-f73cc61cf807">
</p>
<h2 align="center">Display upon clicking on a camera location</h1>
