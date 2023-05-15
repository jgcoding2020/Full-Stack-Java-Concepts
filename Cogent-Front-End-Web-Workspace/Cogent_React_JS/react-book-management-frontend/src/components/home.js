import React, { useState, useEffect } from 'react';
import './home.css'

const Home = () => {
    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [books, setBooks] = useState([]);
    useEffect(() => {
        fetch("http://localhost:8080/api/book/all")
            .then(res => res.json())
            .then(
                (data) => {
                    setIsLoaded(true);
                    setBooks(data);
                },
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
    }, [])

    const handleAddBook = () => {
        window.location.href = "/addBook";
    }

    const handleUpdateBook = (id) => {
        window.location.href = `/updateBook/${id}`;
    }

    const handleDeleteBook = id => {
        fetch(`http://localhost:8080/api/book/${id}`, {
            method: 'DELETE'
        })
            .then(() => setBooks(books.filter(book => book.id !== id)))
            .catch(error => console.error(error));
    };

    if (error) {
        return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
        return <div>Loading...</div>;
    } else {
        return (
            <div>
                <h1>React Book CRUD App</h1>
                <div className="div-add-book">
                    <button className="button-add" onClick={handleAddBook}>Create Book</button>
                </div>
                <table>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Title</th>
                            <th>Price</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody key={books.id}>
                        {books.map(book => (
                            <tr key={book.id}>
                                <td className="td-id">{book.id}</td>
                                <td className="td-title">{book.title}</td>
                                <td className="td-price">${book.price}</td>
                                <td className="td-buttons">
                                    <button className="button-update" onClick={() => handleUpdateBook(book.id)}>Update</button>
                                    <button className="button-delete" onClick={() => handleDeleteBook(book.id)}>Delete</button>
                                </td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default Home;
