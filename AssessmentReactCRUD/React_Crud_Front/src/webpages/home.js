import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
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
                <div class="div-add-search">
                    <label class="input-search">
                        <input type="text"></input>
                        <button class="button-search">Search</button>
                    </label>
                    <button class="button-add" onClick={handleAddUser}>Create User</button>
                </div>
                <table>
                    <thead>
                        <th>Selfie</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </thead>
                    <tbody key={users.id}>
                        {users.map(user => (
                            <tr key={user.id}>
                                <td class="td-img"><img src={user.picture}></img></td>
                                <td>{user.first_name}</td>
                                <td>{user.last_name}</td>
                                <td>{user.email}</td>
                                <td class="td-buttons">
                                    <button class="button-update" onClick={() => handleUpdateUser(user.id)}>Update</button>
                                    <button class="button-delete" onClick={() => handleDeleteUser(user.id)}>Delete</button>
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

