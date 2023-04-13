var numbers = "56789";

document.write("<center>The numbers are: " + numbers);
document.write("<br>The numbers reversed: ");
var temp = "";
for (i = numbers.length - 1; i >= 0; i--)
{
    temp += numbers[i];
}
numbers = temp;
document.write(numbers);
document.write("</center>");
