import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './CohortDetails';
import styles from './CohortDetails.module.css';

function App() {
  return (
    <div style={{ maxWidth: '1200px', margin: '0 auto' }}>
      <h1 style={{ textAlign: 'center' }}>Cohorts Details</h1>
      <div className={styles.container}>
        {CohortsData.slice(0, 3).map((cohort, index) => (
  <CohortDetails key={index} cohort={cohort} />
))}

      </div>
    </div>
  );
}

export default App;
