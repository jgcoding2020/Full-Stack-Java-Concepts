import React from 'react';

class App extends React.Component {

  constructor(props){
    super(props);
    this.state = {hello: " World!"};
  }

  componentWillMount(){
    console.log("componentWillMount()");
  }

  componentDidMount(){
    console.log("componentDidMount()");
  }

  changeState(){
    this.setState({hello: " Cogent!"});
  }

  render() {
    return (
      <div>
        <h1>Cogent.org, Hello{this.state.hello}</h1>
        <h2>
          <a onClick={this.changeState.bind(this)}>Press here!!!</a>
        </h2>
      </div>
    );
  }

  shouldComponentUpdate(){
    console.log("shouldComponentUpdate()");
    return true;
  }

  componentWillUpdate(){
    console.log("componentWillUpdate()");
  }

  componentDidUpdate(){
    console.log("componentDidUpdate()");
  }
}

export default App;
