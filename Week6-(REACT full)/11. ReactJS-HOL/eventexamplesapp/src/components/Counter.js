import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
    alert("Hello! Static message");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <p>{count}</p>
      <button onClick={increment}>Increment</button><br />
      <button onClick={decrement}>Decrement</button><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button><br />
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
}

export default Counter;
