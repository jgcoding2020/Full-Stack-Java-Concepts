import { useState, useEffect} from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log(`You have clicked the button ${count} times.`);
  });

  return (
    <div>
      <p>You have clicked the button {count} times.</p>
      <button onClick={() => setCount(count + 1)}>Click Me!</button>
    </div>
  );
}

export default App;
