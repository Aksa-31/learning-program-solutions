import React, { useState } from "react";

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleAmountChange = (e) => {
    setAmount(e.target.value);
  };

  const handleCurrencyChange = (e) => {
    setCurrency(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const euroRate = 80;
    const result = amount * euroRate;
    alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input type="text" value={amount} onChange={handleAmountChange} />
        </label><br />
        <label>
          Currency:
          <textarea value={currency} onChange={handleCurrencyChange}></textarea>
        </label><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;
