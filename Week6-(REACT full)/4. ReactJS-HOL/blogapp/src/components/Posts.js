// Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(post => new Post(post.id, post.title, post.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        alert('Error while fetching posts');
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>All Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
  }
}

export default Posts;
