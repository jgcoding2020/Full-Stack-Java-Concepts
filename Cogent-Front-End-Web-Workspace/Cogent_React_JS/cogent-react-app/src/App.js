import logo from './logo.svg';
import './App.css';

import Item from './components/Item.js';

const App = () => {
  const itemList = [
    {
        itemNo: '1',
        title: 't-shirt',
        amount: '$19.99',
        date: '01/15/2023'
    },
    {
        itemNo: '2',
        title: 'pants',
        amount: '$39.99',
        date: '05/02/2023'
    },
    {
        itemNo: '3',
        title: 'shoes',
        amount: '$89.99',
        date: '03/25/2023'
    },
];
  return (
    <div className="App">
      <Item itemNo={itemList[0].itemNo} title={itemList[0].title} amount={itemList[0].amount} date={itemList[0].date}></Item>
      <Item itemNo={itemList[1].itemNo} title={itemList[1].title} amount={itemList[1].amount} date={itemList[1].date}></Item>
      <Item itemNo={itemList[2].itemNo} title={itemList[2].title} amount={itemList[2].amount} date={itemList[2].date}></Item>
    </div>
  );
}

export default App;
