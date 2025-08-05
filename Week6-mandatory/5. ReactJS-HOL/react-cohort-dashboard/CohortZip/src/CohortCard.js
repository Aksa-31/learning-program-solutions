import React from "react";

function CohortCard({ cohort }) {
  const cardStyle = {
    border: "1px solid #ccc",
    borderRadius: "10px",
    padding: "15px",
    margin: "10px",
    width: "250px",
    boxShadow: "2px 2px 8px rgba(0,0,0,0.1)",
  };

  const titleStyle = {
    color: cohort.title.includes("Java") ? "green" : "blue",
    fontWeight: "bold",
    fontSize: "16px",
    marginBottom: "10px"
  };

  return (
    <div style={cardStyle}>
      <div style={titleStyle}>{cohort.title}</div>
      <p><strong>Started On</strong><br />{cohort.startDate}</p>
      <p><strong>Current Status</strong><br />{cohort.status}</p>
      <p><strong>Coach</strong><br />{cohort.coach}</p>
      <p><strong>Trainer</strong><br />{cohort.trainer}</p>
    </div>
  );
}

export default CohortCard;
