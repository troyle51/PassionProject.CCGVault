import React from 'react';

function LoginModal({ closeModal }) {
    return (
        <div className="modalBackground">
            <div className="modalContainer">
                <button onClick={() => closeModal(false)}> X </button>
                <div className="title">
                    <h1>Are you sure you want to continue?</h1>
                </div>
                <div className="body">
                    <p>The next page is awesome</p>
                </div>
                <div className="footer">
                    <button onClick={() => closeModal(false)}>Cancel</button>
                    <button>Continue</button>
                </div>
            </div>
        </div>
    )
}
export default LoginModal