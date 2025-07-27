// CohortDetails.jsx
import React from 'react';
import styles from './CohortDetails.module.css'; // CSS module import

// CohortCard is reusable for each cohort
const CohortCard = ({ cohort }) => {
  const titleStyle = {
    color: cohort.status.toLowerCase() === 'ongoing' ? 'green' : 'blue',
  };

  return (
    <div className={styles.box}>
      <h3 style={titleStyle}>{cohort.name}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.status}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coach}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>
      </dl>
    </div>
  );
};

const CohortDetails = () => {
  const cohortList = [
    {
      name: 'INTADMDF10 -.NET FSD',
      startDate: '22-Feb-2022',
      status: 'Scheduled',
      coach: 'Aathma',
      trainer: 'Jojo Jose',
    },
    {
      name: 'ADM21JF014 - Java FSD',
      startDate: '10-Sep-2021',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith',
    },
    {
      name: 'CDBJF21025 - Java FSD',
      startDate: '24-Dec-2021',
      status: 'Ongoing',
      coach: 'Aathma',
      trainer: 'John Doe',
    },
  ];

  return (
    <div>
      <h2>Cohorts Details</h2>
      {cohortList.map((cohort, index) => (
        <CohortCard key={index} cohort={cohort} />
      ))}
    </div>
  );
};

export default CohortDetails;

