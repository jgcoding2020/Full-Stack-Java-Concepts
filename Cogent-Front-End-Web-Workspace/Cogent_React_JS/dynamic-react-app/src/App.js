import React from 'react';

class App extends React.Component {

    constructor(props){
      super(props);
      this.state={count:0};
    }
    incrementCount=()=>{
      this.setState({count:this.state.count+1});
    }
    render(){
      return(
        <div>
          <p>{this.state.count}</p>
          <button onClick={this.incrementCount}>increment count</button>
        </div>
      );
    }
}

export default App;