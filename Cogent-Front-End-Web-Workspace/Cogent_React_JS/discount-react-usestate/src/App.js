import { useState } from 'react';
import tshirt from './images/t-shirt.jpeg';
import './App.css';

function App() {
  const itemNo = 1001;
  const product = "t-shirt";
  const [price, setPrice] = useState(new Intl.NumberFormat('en-US',
    { style: 'currency', currency: 'USD' }
  ).format(100));
  
  const changePrice = () => {
    setPrice(new Intl.NumberFormat('en-US',
      { style: 'currency', currency: 'USD' }
    ).format(75.00)
    );
  };

  return (
    <div class="div-outer">
      <h1>T Shop Discounts</h1>
      <div class="div-table">
        <img src={tshirt}></img>
        <table>
          <tbody>
            <tr>
              <td>Item No:</td>
              <td class="td-item-no">{itemNo}</td>
            </tr>
            <tr>
              <td>Product:</td>
              <td class="td-product">{product}</td>
            </tr>
            <tr>
              <td>Price:</td>
              <td class="td-price">{price}</td>
            </tr>
            <tr>
              <td class="td-button" colSpan="2"><button onClick={changePrice}>Discount</button></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
