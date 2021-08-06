// function _keys(obj)
// {
//     if(!isObject(obj)) return [];
//     if(Object.keys) return Object.keys(obj);
//     var keys = [];
//     for(var key in obj) if (_keys.has(obj, key)) keys.push(key);
//     return keys;
// }
// function isObject(obj)
// {
//     var type = typeof obj;
//     return type === 'function' || type === 'object' && !!obj;

// }
// console.log(_keys({red: "#FF0000", green: "#00FF00", white: "#FFFFFF"}));

// var store = [];
// var i,j, primes = [];
// var max = 5;

// for(i = 2; i <= max; ++i){
    
//     for(j = i << 1; j <= max; j +=i){
//         if(!store[i]){
//             store[j] = true;
//         }
//         primes.push(i);

//     }
//     return primes;
// }

// const http = require('http');
// const server = http.createServer((req,res)=>{
//     if(req.url === '/'){
//         res.write('Hello World');
//         res.end();
//     }
//     if(req.url === '/api/students'){
//         debugger;
//         res.write(JSON.stringify(["Sarah","Anna", 3]));
//         res.end();
//     }
// });
// server.on('connection',(soket)=>{
//     console.log('New connection..')
// });
// server.listen(8095);

// console.log('Listen on port 8095..');

const express = require('express');
const app = express();

app.get('/api/courses/:id',(req,res)=>{
    res.send(req.params.id);
});
app.listen(3000,()=> console.log('Start to listen at 3000'));