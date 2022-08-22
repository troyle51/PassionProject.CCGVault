import React from 'react';
import { useState } from 'react';
import Image from 'react-image-enlarger';




const DigiCard = ({card}) => {
    const [counter, setCounter] = useState(0);
    
    const [zoomed, setZoomed] = React.useState(false);

    return(
        <div className="card">
            <div>
                {/* <p>{card.type}</p> */}
            </div>

            <div>
                <Image 
                    style={{ width: "auto", height: "auto" }}
                    zoomed={zoomed}
                    src={`https://images.digimoncard.io/images/cards/${card.cardnumber}.jpg`}
                    alt={card.name}
                    onClick={() => setZoomed(true)}
                    onRequestClose={() => setZoomed(false)}
                />
                {/* <img 
                    src={card.image_url ? card.image_url : `https://images.digimoncard.io/images/cards/${card.cardnumber}.jpg`} 
                    alt={card.name}
                /> */}
            </div>
            <div>
                <span>{card.stage}</span>
                <h3>{card.name}</h3>
                <counter>
                    <button onClick={() => setCounter((prevCount) => prevCount - 1)}> - </button>
                    <h3> &nbsp;{counter}&nbsp; </h3>
                    <button onClick={() => setCounter((prevCount) => prevCount + 1)}> + </button>
                </counter>
            </div>
            

        </div>
    );
}

export default DigiCard;