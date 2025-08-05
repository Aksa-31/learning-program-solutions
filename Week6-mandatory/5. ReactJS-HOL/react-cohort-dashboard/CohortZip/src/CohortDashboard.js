import React from "react";
import CohortCard from "./CohortCard";

function CohortDashboard() {
  const cohortList = [
    {
      title: "INTADMDF10 - .NET FSD",
      startDate: "22-Feb-2022",
      status: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose"
    },
    {
      title: "ADM21JF014 - Java FSD",
      startDate: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },
    {
      title: "CDBJF21025 - Java FSD",
      startDate: "24-Dec-2021",
      status: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe"
    }
  ];

  const containerStyle = {
    display: "flex",
    justifyContent: "center",
    flexWrap: "wrap",
    padding: "20px"
  };

  return (
    <div>
      <h2 style={{ marginLeft: "20px" }}>Cohorts Details</h2>
      <div style={containerStyle}>
        {cohortList.map((cohort, index) => (
          <CohortCard key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default CohortDashboard;
