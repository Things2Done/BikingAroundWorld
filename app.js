console.log("connected");

let button;
button = document.getElementById("bikebutton");
console.log(button);

let bikerImage;
bikerImage = document.getElementById("biker");



let globeImages = document.getElementsByClassName("globeImages");


button.addEventListener("click", function(){
    //console.log("buttonclicked")
    if (bikerImage.style.display === "none"){
        bikerImage.style.display = "block";}
        else{
            bikerImage.style.display = "none";
        }
    }
)


window.addEventListener("scroll",fucntion(){
     i=0,i=globeImages.length, i= i++){
    gallery.appendChild(globeImages[i])
}}
)