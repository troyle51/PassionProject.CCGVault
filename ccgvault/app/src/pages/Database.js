import { useEffect, useState } from 'react';
import '../App.css';
import SearchIcon from '../search.svg';
import DigiCard from '../DigiCard';

const API_URL = 'https://digimoncard.io/api-public/search.php?'

function Database() {


    const [card, setCard] = useState([]);
    const [searchTerm, setSearchTerm] = useState('');

    const searchCards = async (name) => {
        const response = await fetch(`${API_URL}n=${name}`);
        const data = await response.json();

        
        setCard(data)
    }

    useEffect(() => {
        searchCards()
    }, []);


    return (
      <>
        <div className="app">
            <h1>Digimon Card Database</h1>
            <div className='search'>
              <input
                placeholder='Search for Card'
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
              />
              <img 
                src={SearchIcon}
                alt="search"
                onClick={() => searchCards(searchTerm)}
              />
            </div>
            {
              card?.length > 0
              ? (
                <div className='container'>
                  {card.map((card) => (
                    <DigiCard card={card} />
                  ))}
                </div>
              ):(
                <div className='empty'>
                  <h2>No cards found</h2>
                </div>
              )}

        </div>
      </>
            
    );
}

export default Database;