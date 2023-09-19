let button;
button = document.getElementById("bikebutton");


const bikerContainer = document.querySelector('#biker-container');


button.addEventListener("click", function(){
    //console.log("buttonclicked")
    if (bikerContainer.style.display === "none"){
        bikerContainer.style.display = "block";}
        else{
            bikerContainer.style.display = "none";
        }
    }
)

window.addEventListener('scroll', () => {
	const refHeight = window.innerHeight / 4.2; // change as you need
	const degValue = window.scrollY / refHeight * -180; // top = 0, down = -180
	// console.log(degValue);
	bikerContainer.style.transform = `rotate(${degValue}deg)`;
	// `${}` is template strings, `My name is ${name}` equals to 'My name is' + name.
	// So we don't have to write like 'rotate(' + degValue + 'deg)', which is cumbersome.
	// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals
});


function spinButton(){
    this.classList.add("spin");
}
function stopSpinning(){
    this.classList.remove("spin")
}

button.addEventListener("mouseover", spinButton);
button.addEventListener("mouseout", stopSpinning);