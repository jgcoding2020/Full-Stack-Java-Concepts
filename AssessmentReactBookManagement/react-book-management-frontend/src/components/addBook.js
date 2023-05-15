import React, { useState } from "react";
import './addBook.css';

function AddBook() {
    const [title, setTitle] = useState("");
    const [price, setPrice] = useState("");
    
    const handleSubmit = (e) => {
        e.preventDefault();
        const book = { title, price };

        fetch("http://localhost:8080/api/book/add", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(book),
        })
            .then((response) => response.json())
            .then(() => {
                window.location.href = "/";
            })
            .catch((error) => console.error(error));
    };

    return (
        <div className="div-outer">
            <h1>Add Book</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label htmlFor="title">Title</label>
                    <input
                        type="text"
                        id="title"
                        name="title"
                        value={title}
                        onChange={(e) => setTitle(e.target.value)}
                    ></input>
                </div>
                <div>
                    <label htmlFor="price">Price</label>
                    <input
                        type="text"
                        id="price"
                        name="price"
                        value={price}
                        onChange={(e) => setPrice(e.target.value)}
                    ></input>
                </div>
                <button className="button-submit-add" type="submit">Submit</button>
            </form>
        </div>
    );
}

export default AddBook;