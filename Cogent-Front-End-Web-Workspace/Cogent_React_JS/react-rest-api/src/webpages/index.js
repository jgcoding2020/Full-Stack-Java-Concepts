import React from 'react';
import {
    BrowserRouter,
    Route,
    Routes
} from "react-router-dom";
import Home from './home';
import User from './user';
const Webpages = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/" element={<Home />} />
                <Route path="/user/*" element={<User />} />
            </Routes>
        </BrowserRouter>
    );
};
export default Webpages;