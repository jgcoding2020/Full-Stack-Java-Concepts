import React from 'react';
import './App.css';
import tshirt from './images/t-shirt.jpeg';

class App extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      itemNo: "1001", product: "t-shirt", price: new Intl.NumberFormat('en-US',
        { style: 'currency', currency: 'USD' }
      ).format(100)
    };
  }

  discount = () => {
    this.setState({
      price: new Intl.NumberFormat('en-US',
        { style: 'currency', currency: 'USD' }
      ).format(75)
    })
  }

  render() {
    return (
      <div class="div-outer">
        <h1>T Shop Discounts</h1>
        <div class="div-table">
          <img src={tshirt}></img>
          <table>
            <tbody>
              <tr>
                <td>Item No:</td>
                <td class="td-item-no">{this.state.itemNo}</td>
              </tr>
              <tr>
                <td>Product:</td>
                <td class="td-product">{this.state.product}</td>
              </tr>
              <tr>
                <td>Price:</td>
                <td class="td-price">{this.state.price}</td>
              </tr>
              <tr>
                <td class="td-button" colSpan="2"><button onClick={this.discount}>Discount</button></td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}


export default App;
