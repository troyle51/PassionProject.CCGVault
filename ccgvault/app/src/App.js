import logo from './logo.svg';
import './App.css';
import  { React, useState, useEffect } from 'react';
import axios from "axios";

const App = () => {
    const [cardGame, setGame] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
    setLoading(true);


    axios.get(`https://api.dictionaryapi.dev/api/v2/entries/en_US/${inputText}`)
    .then((response => { response.json())
    .then(data => {
        setCardGame(data);
        setLoading(false);
    })
    }, []});

    if (loading) {
    return <p>Loading...</p>
    }

    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <div className="App-intro">
                <h2>List</h2>
                {cardGame.map(group =>
                <div key={cardGame.id}>
                {cardGame.name}
                </div>
                )}
          </header>
        </div>
      );
}
}


export default App;
