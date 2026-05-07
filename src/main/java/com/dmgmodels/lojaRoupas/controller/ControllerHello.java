package com.dmgmodels.lojaRoupas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ControllerHello {

    @GetMapping
    public String sayHello() {
        return """
                    <style>
                        * {
                         margin: 0;
                         padding: 0;
                         box-sizing: border-box; 
                         font-family: "Poppins", sans-serif;
                         text-decoration: none;
                         list-style-type: none;  
                        }
                        
                        .wrapperContent {
                            max-width: 100%;
                            width: 100%;
                            height: 100%;
                            position: relative;
                            background-color: transparent;
                        }
                        
                        .topContent {
                            width: 100%;
                            height: auto;
                            padding: 10px 2%;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            background-color: #0b0b0b;
                        }
                        
                        .topContent h1 {
                            color: #fafafa;
                            font-size: 15px;
                            letter-spacing: 0.5px;
                            font-weight: bold;
                        }
                       
                       .mainContainer {
                            
                       }
                    </style>
                    
                    <head>
                         <link rel="preconnect" href="https://fonts.googleapis.com">
                         <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                         <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
                    </head>
                    
                    <body>
                        <section class='wrapperContent'>
                            <section class='topContent'>
                                <h1>🚛 COMPRE AGORA COM FRETE GRÁTIS 🚛</h1>
                            </section>
                            
                            <main id='mainContainer' class='mainContainer'>
                                <h1>LOJA DO JOÃO</h1>
                            </main>
                        </section>
                    </body>
               """;
    }


}
