import React from "react";
import EmployeeCard from "./EmployeeCard";

const EmployeesList = () => {
  const employees = [
    {
      id: 101,
      name: "Jojo",
      email: "jojo@congizant.com",
      phone: "98238971234",
    },
    {
      id: 102,
      name: "Sam",
      email: "sam@congizant.com",
      phone: "9981184126",
    },
    {
      id: 103,
      name: "Elisa",
      email: "elisa@cognizant.com",
      phone: "9989389735",
    },
  ];

  return (
    <div>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
};

export default EmployeesList;
