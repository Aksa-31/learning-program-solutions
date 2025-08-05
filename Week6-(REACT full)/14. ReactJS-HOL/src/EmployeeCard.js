import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

const EmployeeCard = ({ employee }) => {
  const theme = useContext(ThemeContext);

  const showDetails = () => {
    alert(
      `Employee ID: ${employee.id}\nName: ${employee.name}\nEmail: ${employee.email}\nPhone: ${employee.phone}`
    );
  };

  return (
    <div className={`card ${theme}`}>
      <h3>Employee Name: {employee.name}</h3>
      <p>Email: {employee.email}</p>
      <p>Phone: {employee.phone}</p>
      <button className={`btn ${theme}`} onClick={showDetails}>
        Click Me
      </button>
    </div>
  );
};

export default EmployeeCard;
