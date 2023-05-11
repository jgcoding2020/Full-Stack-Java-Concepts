import { Outlet, Link } from 'react-router-dom';
import './Navbar.css';

function Navbar () {
    return (
        <div>
            <nav>
                <Link to="./home">Home</Link>
                <Link to="./about">About</Link>
                <Link to="./contact">Contact</Link>
                <Link to="./services">Services</Link>
            </nav>
            
            <Outlet></Outlet>
        </div>
    );

}

export default Navbar;