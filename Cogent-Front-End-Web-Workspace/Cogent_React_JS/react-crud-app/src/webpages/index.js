import React from 'react';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from './home';
import UpdateUser from './updateUser';
import AddUser from './addUser'

const Webpages = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/" element={<Home />} />
                <Route path="/updateUser/:id" element={<UpdateUser />} />
                <Route path="/addUser/" element={<AddUser />} />
            </Routes>
        </BrowserRouter>
    );
};
export default Webpages;