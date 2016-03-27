angular.module("minInput", []);
function newInput(){
	var newIn = this;
	newIn.var1 = 0;
}


angular.module("minInput").controller("cntr", newInput)