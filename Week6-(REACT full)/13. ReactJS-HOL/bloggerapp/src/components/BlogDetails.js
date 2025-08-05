import React from 'react';

function BlogDetails() {
  const content = (
    <>
      <h2>React Learning</h2>
      <p><b>Stephen Biz</b></p>
      <p>Welcome to learning React!</p>

      <h2>Installation</h2>
      <p><b>Schewzdenier</b></p>
      <p>You can install React from npm.</p>
    </>
  );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

export default BlogDetails;
