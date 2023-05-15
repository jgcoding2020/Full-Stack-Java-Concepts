import React from 'react';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from './home';
import UpdateBook from './updateBook';
import AddBook from './addBook';

const Components = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/" element={<Home />} />
                <Route path="/updateBook/:id" element={<UpdateBook />} />
                <Route path="/addBook/" element={<AddBook />} />
            </Routes>
        </BrowserRouter>
    );
};
export default Components;