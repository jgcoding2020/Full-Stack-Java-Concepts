import React, { useState } from "react";
import './addUser.css';

function AddUser() {
    const [first_name, setFirstname] = useState("");
    const [last_name, setLastname] = useState("");
    const [email, setEmail] = useState("");
    const [picture, setPicture] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        const user = { first_name, last_name, email, picture };

        fetch("http://localhost:8080/api/user/add", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(user),
        })
            .then((response) => response.json())
            .then(() => {
                window.location.href = "/";
            })
            .catch((error) => console.error(error));
    };

    return (
        <div class="div-outer">
            <h1>Add User</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label htmlFor="first_name">First Name</label>
                    <input
                        type="text"
                        id="first_name"
                        className="form-control"
                        value={first_name}
                        onChange={(e) => setFirstname(e.target.value)}
                    ></input>
                </div>
                <div>
                    <label htmlFor="last_name">Last Name</label>
                    <input
                        type="text"
                        id="last_name"
                        className="form-control"
                        value={last_name}
                        onChange={(e) => setLastname(e.target.value)}
                    ></input>
                </div>
                <div>
                    <label htmlFor="email">Email</label>
                    <input
                        type="email"
                        id="email"
                        className="form-control"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                    ></input>
                </div>
                <div>
                    <label htmlFor="picture">Picture</label>
                    <input
                        type="string"
                        id="picture"
                        className="form-control"
                        value={picture}
                        onChange={(e) => setPicture(e.target.value)}
                    ></input>
                </div>
                <button class="button-submit-add" type="submit">Submit</button>
            </form>
        </div>
    );
}

export default AddUser;