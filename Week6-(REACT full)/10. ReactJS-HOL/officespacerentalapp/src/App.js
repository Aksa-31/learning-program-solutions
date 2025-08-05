import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";

  const sr = "https://images.unsplash.com/photo-1573164574572-cb89e39749b4"; // your image URL

  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  // Conditional styling class
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  return (
    <div className="App">
      <h1>{element} , at Affordable Range</h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
