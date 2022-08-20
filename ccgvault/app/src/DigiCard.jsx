import React from 'react';
import { useState } from 'react';




const DigiCard = ({card}) => {
    const [counter, setCounter] = useState(0);
    
    

    return(
        <div className="card">
            <div>
                <p>{card.type}</p>
            </div>

            <div>
                <img src={card.image_url} alt={card.name}/>
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