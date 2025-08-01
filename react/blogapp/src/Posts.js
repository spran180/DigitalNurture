import React from "react";
import Post from "./Post";
class Posts extends React.Component {
    constructor(props) {
        super(props)

        this.state = {
            posts: [],
            error: null
        }
    }

    loadPosts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then((response) => {
            if(!response.ok) {
                return new Error("We are having some trouble")
            }

            return response.json()
        })
        .then((data) => 
            this.setState({posts: data.map((p) => new Post(p.id, p.title, p.body))})
        ).catch((error) => new Error("We are having some trouble"))
    }

    componentDidMount(){
        this.loadPosts()
    }

    render(){
        const {posts, error} = this.state;
        return (
            <div>
                <h1>POSTS</h1>
                <div>
                    {posts.map((comp) => 
                    <div key={comp.id} style={{ marginBottom: "1.5rem" }}>
                    <h2>{comp.title}</h2>
                    <h3>{comp.body}</h3>
                    </div>
                    )}
                </div>
            </div>
        )
    }
}

export default Posts;