'use strict';


const express = require('express');
// Constants
const PORT = 8080;
const HOST = '0.0.0.0';
// App
const app = express();
app.get('/', (req, res) => {
res.send(
    <html lang="en" >
    <head>
      <meta charset="UTF-8" />
      <title>CodePen - Full Page Scrolling</title>
      <link rel="stylesheet" href="./style.css" />
    
    </head>
    <body>
    <div class="fixed">
        <div class="navigation">
            <ul id="nav">
            </ul>
        </div>
    </div>
    <div id="main">
        <div class="slide" id="first">
            <div class="content">		
                <h1>THIS IS SOME TEXT</h1>
            </div>
        </div>
        <div class="slide" id="second">
            <div class="content">		
                <h1>THIS IS SOME MORE TEXT!</h1>
                </div>
        </div>
        <div class="slide" id="third">
            <div class="content">		
                <h1>WHY YOU LOOKING AT THIS TEXT?</h1>
                </div>
        </div>
    </div>
    <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script><script  src="./script.js"></script>
    </body>
    </html>
    );
});
app.listen(PORT, HOST);
console.log(`Running on
http://${HOST}:${PORT}`);