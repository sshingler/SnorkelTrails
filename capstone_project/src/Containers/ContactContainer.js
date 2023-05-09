import React from "react";
import '../StyleSheets/ContactPage/ContactPage.css';
import logo from '../Images/logo.png';

const ContactContainer = () => {




    return(
        
        <>


            <div className="logo-div">
                <img className="logo" src={logo} />
            </div>

            <div className="form-container">
                    <h3> Contact Us! </h3>
                    <form action="/">
                        <div className="form-name">
                            <label for="fname"></label>
                            <input type="text" id="fname" name="firstname" placeholder="Name" size="70"/>
                        </div>

                        <div className="form-contact">
                            <label for="contact"></label>
                            <input type="email" id="contact" name="contact" placeholder="Email Address" size="70"/>
                        </div>

                        <div className="form-subject">
                            <label for="subject"></label>
                            <input type="text" id="subject" name="subject" placeholder="Subject" size="70"/>
                        </div>

                        <div className="form-content">
                            <label for="content"></label>
                            <textarea id="message" name="message" placeholder="Your message:" cols="62" rows="10"></textarea>
                        </div>

                        <div className="form-submit">
                            <input type="submit" value="Submit"/>
                        </div>

                    </form>
                
            </div>


            
            
            


        
        
        </>




        
        
        
    );
};

export default ContactContainer;