var obj= "var p1={ firstName: 'Ashii', lastName: 'kaser' };";

eval(obj);

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="nair";

console.log(p1.firstName+" "+p1.lastName);

p1.middleName= "Seer";

console.log(p1.middleName);