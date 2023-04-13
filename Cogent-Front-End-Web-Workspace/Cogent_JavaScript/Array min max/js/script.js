var array = new Array(75467,3654823,657853775,-98987586593,1,-2000);

var min = Number.MAX_VALUE;
var max = Number.MIN_VALUE;
for (i = 0; i < array.length; i++){
    if (min > array[i])
        min = array[i];
    if (max < array[i])
        max = array[i];
}

document.write("Max number in array is: " + max);
document.write("<br>Min number in array is: " + min);