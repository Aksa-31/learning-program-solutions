import React from 'react';

function CourseDetails() {
  const coursedet = (
    <>
      <h2>Angular</h2>
      <p>4/5/2021</p>
      <h2>React</h2>
      <p>6/3/20201</p>
    </>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
}

export default CourseDetails;
