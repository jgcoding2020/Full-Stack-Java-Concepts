import React from 'react';
import './App.css';

class App extends React.Component {

  constructor(props) {
    super(props);
    this.state = { balance: 0, depositAmount: 0 };
  }

  amountToDeposit = (event) => {
    this.setState({ depositAmount: parseInt(event.target.value, 10) });
  }

  deposit = () => {
    this.setState({ balance: parseInt(this.state.balance + this.state.depositAmount, 10) })
  }

  render() {
    return (
      <div class="div-outer">
        <h1>ATM Application</h1>
        <div class="div-table">
          <table>
            <tbody>
              <tr>
                <td>Enter Amount:</td>
                <td class="td-input"><input onChange={this.amountToDeposit} type="number"></input></td>
              </tr>
              <tr>
                <td>Deposit Amount:</td>
                <td class="td-deposit-amount">{this.state.depositAmount}</td>
              </tr>
              <tr>
                <td>Balance:</td>
                <td class="td-balance">{this.state.balance}</td>
              </tr>
              <tr>
                <td class="td-button" colSpan="2"><button onClick={this.deposit}>Deposit</button></td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}


export default App;
