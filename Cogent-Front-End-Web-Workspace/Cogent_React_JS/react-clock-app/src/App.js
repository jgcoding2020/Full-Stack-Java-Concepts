import { useState, useEffect } from 'react';
import './App.css';
function Clock() {
  const [date, setDate] = useState(new Date());

  function refreshClock() {
    setDate(new Date());
  }

  useEffect(() => {
    const timerId = setInterval(refreshClock, 1000);
    return function cleanup() {
      clearInterval(timerId);
    };
  }, []);
  return (
    <div class="div-outer-clock">
      <div class="div-inner-clock">
        {date.toLocaleTimeString()}
      </div>
    </div>
  );
}

export default Clock;