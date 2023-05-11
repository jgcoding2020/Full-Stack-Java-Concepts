import React from 'react';

export default class Form extends React.Component {
    state = {
        firstName: "",
        lastName: "",
        username: "",
        email: "",
        password: ''
    };

    change = e => {
        this.props.onChange({ [e.target.name]: e.target.value });
        this.setState({
            [e.target.name]: e.target.value
        });
    };

    onSubmit = e => {
        e.preventDefault();
        this.setState({
            firstName: "",
            lastName: "",
            username: "",
            email: "",
            password: ''
        }
        );
        this.props.onChange({
            firstName: "",
            lastName: "",
            username: "",
            email: "",
            password: ''
        });
    };

    render() {
        return (
            <form>
                <input
                    name="firstName"
                    placeholder="First Name"
                    value={this.state.firstName}
                    onChange={e => this.change(e)}>
                </input>
                <br/>
                <input
                    name="lastName"
                    placeholder="Last Name"
                    value={this.state.lastName}
                    onChange={e => this.change(e)}>
                </input>
                <br/>
                <input
                    name="username"
                    placeholder="Username"
                    value={this.state.username}
                    onChange={e => this.change(e)}>
                </input>
                <br/>
                <input
                    name="email"
                    placeholder="Email"
                    value={this.state.email}
                    onChange={e => this.change(e)}>
                </input>
                <br/>
                <input
                    name="firstName"
                    placeholder="First Name"
                    value={this.state.firstName}
                    onChange={e => this.change(e)}>
                </input>
                <br/>
                <button onClick={e => this.onSubmit(e)}>Submit</button>
            </form>
        );
    };
}