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
                       
                       .headerContainer {
                            width: 100%;
                            height: 60px;
                            background-color: transparent;
                            display: flex;
                            flex-direction: row;
                            position: relative;
                       }
                       
                       .divisionContainer {
                            max-width: 93%;
                            width: 100%;
                            margin: 0 auto;
                            position: relative;
                            background-color: white;
                            justify-content: space-between;
                       }
                       
                       .divisionContainer,
                       .navigationContainer ul,
                       .iconsContainer ul {
                            display: flex;
                            flex-direction: row;
                            align-items: center;
                       }
                       
                       .navigationContainer ul {
                            display: flex;
                            flex-direction: row;
                            gap: 30px;
                       }
                       
                       .navigationContainer ul li a {
                            color: #0b0b0b;
                            font-size: 16px;
                            font-weight: 600;
                            text-transform: none;
                            letter-spacing: .5px;
                       }
                      
                       .iconsContent {
                            display: flex;
                            gap: 25px;
                       }
                       
                       .mainContainer {
                            width: 100%;
                            position: relative;
                            background-color: transparent;
                            display: flex;
                            flex-direction: column;
                       }
                       
                       .cardContainer {
                            width: 100%;
                            background-color: blue;
                            display: flex;
                            flex-direction: row;
                            justify-content: center;
                            align-items: center;
                            background-color: #fafafa;
                            padding: 8px 0;
                       }
                       
                       .slideContentCard,
                       .titleCardContainer {
                            display: flex;
                            flex-direction: row;
                            justify-content: center;
                            align-items: center;
                       }
                       
                       .slideContentCard {
                            gap: 100px;
                       }
                       
                       .titleCardContainer {
                            gap: 10px;
                       }
                       
                       .titleCardContainer h1 {
                            font-size: 24px;
                            letter-spacing: -.5px;
                       }
                       
                       .titleCardContainer a {
                            color: #0b0b0b;
                            text-decoration: underline;
                       }
                       
                       .mainBanner {
                            width: 100%;
                            height: 80vh;
                            background-image: url('https://www.papeldeparede.etc.br/fotos/wp-content/uploads/papeldeparede-Full-Moon-Dark-montanhas.jpg');
                            background-repeat: no-repeat;
                            background-size: cover;
                            background-attachment: fixed;
                       }
                    </style>
                    
                    <head>
                         <link rel="preconnect" href="https://fonts.googleapis.com">
                         <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                         <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
                         <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=search" />
                         <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&icon_names=shopping_bag_speed" />
                    </head>
                    
                    <body>
                        <section class='wrapperContent'>
                            <section class='topContent'>
                                <h1>🚛 COMPRE AGORA COM FRETE GRÁTIS 🚛</h1>
                            </section>
                            
                            <header id='headerContainer' class='headerContainer'>
                                <div id='divisionContainer' class='divisionContainer'>
                                    <div id='logoContainer' class='logoContainer'>
                                        <figure id='figureContainer' class='figureContainer'>
                                            <img width=64 height=24 src='https://static.cdnlogo.com/logos/n/11/nike.png' alt='Logo do site'/>
                                        </figure>
                                    </div>
                                    
                                    <nav id='navigationContainer' class='navigationContainer'>
                                        <ul>
                                            <li><a href=''>Seleções</a></li>
                                            <li><a href=''>Ofertas</a></li>
                                            <li><a href=''>Lançamentos</a></li>
                                            <li><a href=''>Masculino</a></li>
                                            <li><a href=''>Feminino</a></li>
                                            <li><a href=''>Infantil</a></li>
                                            <li><a href=''>SNKRS</a></li>
                                        </ul>
                                    </nav>
                                    
                                    <section id='iconsContainer' class='iconsContainer'>
                                        <ul class='iconsContent'>
                                            <li><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icons-tabler-outline icon-tabler-search">
                                                 	<path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                 	<path d="M3 10a7 7 0 1 0 14 0a7 7 0 1 0 -14 0" />
                                                 	<path d="M21 21l-6 -6" /></svg>
                                            </li>
                                            
                                            <li><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icons-tabler-outline icon-tabler-heart">
                                                 	<path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                 	<path d="M19.5 12.572l-7.5 7.428l-7.5 -7.428a5 5 0 1 1 7.5 -6.566a5 5 0 1 1 7.5 6.572" />
                                                 </svg>
                                            </li>
                                            
                                            <li>
                                                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icons-tabler-outline icon-tabler-shopping-bag">
                                                 	<path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                                 	<path d="M6.331 8h11.339a2 2 0 0 1 1.977 2.304l-1.255 8.152a3 3 0 0 1 -2.966 2.544h-6.852a3 3 0 0 1 -2.965 -2.544l-1.255 -8.152a2 2 0 0 1 1.977 -2.304" />
                                                 	<path d="M9 11v-5a3 3 0 0 1 6 0v5" />
                                                 </svg>
                                            </li>
                                        </ul>
                                    </section>
                                </div>
                            </header>
                        </section>
                        
                        <main id='mainContainer' class='mainContainer'>
                            <section id='cardContainer' class='cardContainer'>
                               <div id='slideContentCard' class='slideContentCard'>
                                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icons-tabler-outline icon-tabler-chevron-left">
                                     	<path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                     	<path d="M15 6l-6 6l6 6" />
                                     </svg>
                                     
                                     <div id='titleCardContainer' class='titleCardContainer'>
                                        <figure>
                                            <img width=25 height=25 src='https://imgnike-a.akamaihd.net/strapi/nike/gift_card_99aa6b2828/gift_card_99aa6b2828.png' alt='icone site'/>
                                        </figure>
                                        <h1>CARTÃO PRESENTE</h1>
                                        <p>para presentes de última hora.</p>
                                        <a href=''>Saiba Mais.</a>
                                     </div>
                                     
                                     <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="icon icon-tabler icons-tabler-outline icon-tabler-chevron-right">
                                      	<path stroke="none" d="M0 0h24v24H0z" fill="none" />
                                      	<path d="M9 6l6 6l-6 6" />
                                      </svg>
                               </div> 
                            </section>
                            
                            <section id='mainBanner' class='mainBanner'>
                                
                            </section>
                        </main>
                    </body>
               """;
    }


}
