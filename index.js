import React from 'react';
import ReactDOM from 'react-dom';

class Car extends React.Component {
  render() {
    return <h2>I am a {this.props.brand.model}!</h2>;
  }
}
class Bike extends React.Component {
  render() {
    return <h2>I am a {this.props.brand.model}!</h2>;
  }
}

class Garage extends React.Component {
  render() {
    const carinfo = {name: "Ford", model: "Mustang"};
	const bikeinfo = {name: "Bajaj", model: "Pulsar"};
    return (
      <div>
      <h1>Who lives in my garage?</h1>
      <Car brand={carinfo} />
	  <Bike brand={bikeinfo} />
      </div>
    );
  }
}

ReactDOM.render(<Garage />, document.getElementById('root'));

