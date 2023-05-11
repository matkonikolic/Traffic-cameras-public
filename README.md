# Website for informing road traffic participants
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

![image](https://github.com/matkonikolic/Cameras-app/assets/108575954/16f9dc34-f379-4fd6-a3ea-74884a2f5004)

# Final product
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Cameras-app/assets/108575954/bb7b558f-572c-4adb-ad87-659a1522d417">
</p>
<h2 align="center">Default view upon opening the web page</h1>
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Cameras-app/assets/108575954/70e8ce24-25d6-4e37-9b07-e630300037e2">
</p>
<h2 align="center">Zoomed in view</h1>
<p align="center">
    <img width="800" src="https://github.com/matkonikolic/Cameras-app/assets/108575954/4ee47317-9264-478e-9c5a-c9e774f5f9a8">
</p>
<h2 align="center">Display upon clicking on a camera location</h1>
