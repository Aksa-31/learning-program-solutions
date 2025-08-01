import React, { useState } from 'react';
import ThemeContext from './ThemeContext';
import EmployeesList from './EmployeesList';
import { EmployeesData } from './Employee';

function App() {
  const [theme] = useState('light');

  return (
    <ThemeContext.Provider value={theme}>
      <EmployeesList employees={EmployeesData} />
    </ThemeContext.Provider>
  );
}

export default App;
