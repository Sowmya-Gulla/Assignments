var obj= { "firstName": "Ashi", "lastName": "kaser" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="nair";

console.log(p1.firstName+" "+p1.lastName);

p1.middleName= "Seer";

console.log(p1.middleName);