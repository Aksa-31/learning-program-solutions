import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  const handleClick = () => {
    alert(`Employee ID: ${employee.id}\nName: ${employee.name}\nEmail: ${employee.email}\nPhone: ${employee.phone}`);
  };

  return (
    <div>
      <h3>Employee Name: {employee.name}</h3>
      <p>Email: {employee.email}</p>
      <p>Phone: {employee.phone}</p>
      <button onClick={handleClick}>Click Me</button>
      <hr />
    </div>
  );
}

export default EmployeeCard;

