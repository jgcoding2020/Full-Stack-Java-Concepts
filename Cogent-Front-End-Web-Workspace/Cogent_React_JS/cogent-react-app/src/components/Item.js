import './Item.css';

function Item(prop) {
    return (
        <table class="table-item">
            <tr>
                <td>Id</td>
                <td>Title</td>
                <td>Price</td>
                <td>Date</td>
            </tr>
            <tr>
                <td>{prop.itemNo}</td>
                <td>{prop.title}</td>
                <td>{prop.amount}</td>
                <td>{prop.date}</td>
            </tr>
        </table>
    );
}

export default Item;

/* import React from 'react'

class Item extends React.Component {
    render() {
        return (
            <div class="item">
                <div>Item No: 1</div>
                <div>Type: T-shirt</div>
                <div>Price: $19.99</div>
            </div>
        );
    }
}

export default Item; */

/* const Item = () => {
    return (
        <div class="item">
            <div>Item No: 1</div>
            <div>Type: T-shirt</div>
            <div>Price: $19.99</div>
        </div>
    );
}

export default Item; */