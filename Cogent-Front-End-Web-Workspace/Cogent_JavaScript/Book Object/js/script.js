function Book(){
    this.name = "Golden Eye";
    this.author = "Some person";
    this.publisher = "Some company";

    this.display = function (){
        document.write("Inside object display:");
    }
}

var bookObject = new Book();
Book.prototype.year = 1995;
bookObject.display();
document.write("<br>Book name: " + bookObject.name);
document.write("<br>Book author: " + bookObject.author);
document.write("<br>Book publisher: " + bookObject.publisher);
document.write("<br>Book year: " + bookObject.year);