import React, { useState, useEffect } from 'react';
import './home.css'

const Home = () => {
    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [users, setUsers] = useState([]);
    useEffect(() => {
        fetch("http://localhost:8080/api/user/getallusers")
            .then(res => res.json())
            .then(
                (data) => {
                    setIsLoaded(true);
                    setUsers(data);
                },
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
    }, [])

    const handleAddUser = () => {
        window.location.href = "/addUser";
    }

    const handleUpdateUser = (id) => {
        window.location.href = `/updateUser/${id}`;
    }

    const handleDeleteUser = id => {
        fetch(`http://localhost:8080/api/user/${id}`, {
            method: 'DELETE'
        })
            .then(() => setUsers(users.filter(user => user.id !== id)))
            .catch(error => console.error(error));
    };

    if (error) {
        return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
        return <div>Loading...</div>;
    } else {
        return (
            <div>
                <h1>React CRUD App</h1>
                <div className="div-add-search">
                    <label className="input-search" htmlFor="search">
                        <input type="text" name="search" id="search" placeholder="name"></input>
                        <button className="button-search">Search</button>
                    </label>
                    <button className="button-add" onClick={handleAddUser}>Create User</button>
                </div>
                <table>
                    <thead>
                        <tr>
                            <th>Selfie</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody key={users.id}>
                        {users.map(user => (
                            <tr key={user.id}>
                                <td className="td-img"><img src={user.picture} alt="head shot"></img></td>
                                <td>{user.first_name}</td>
                                <td>{user.last_name}</td>
                                <td className="td-email">{user.email}</td>
                                <td className="td-buttons">
                                    <button className="button-update" onClick={() => handleUpdateUser(user.id)}>Update</button>
                                    <button className="button-delete" onClick={() => handleDeleteUser(user.id)}>Delete</button>
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

