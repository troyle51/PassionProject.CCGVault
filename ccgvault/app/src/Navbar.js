import { Link, useMatch, useResolvedPath } from 'react-router-dom';
import LoginModal from './LoginModal';
import { useState } from 'react';

export default function Navbar() {
    const [openModal, setOpenModal] = useState(false);
    
    return <nav className="nav">
        <Link to="/" className="site-title">CCGVault</Link>
        <ul>
            <CustomLink to="/login">Login</CustomLink>
            <CustomLink to="/database">Database</CustomLink>
            <CustomLink to="/collection">Collection</CustomLink>
                {/* <button className="openModalBtn" onClick={() => {
                    setOpenModal(true);
                }}> Open </button>
            {openModal && <LoginModal closeModal={setOpenModal}/>} */}
        </ul>
    </nav>
}





function CustomLink({to, children, ...props}) {
    const resolvedPath = useResolvedPath(to)
    const isActive = useMatch( {path: resolvedPath.pathname, end: true} )
    
    return(
        <li className={isActive ? "active" : ""}>
            <Link to={to} {...props}>{children}</Link>
        </li>
    )
}