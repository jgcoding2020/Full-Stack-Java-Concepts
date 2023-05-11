import './App.css';
import { useState } from 'react';

function App() {
    const [name, setName] = useState("Santa Clause");
    const changeName = () => {
        setName("Easter Bunny");
    };

    return (
        <div>
            <p>
                My name is {name}
            </p>
            <button onClick={changeName}>Click Me!!!</button>
        </div>
    );
}

export default App;
