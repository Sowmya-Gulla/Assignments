class Rectangle{
    constructor(length,breadth){
        this.length=length;
        this.breadth=breadth;
    }
    getLength(){
         console.log('Length : '+this.length);
    }
    getBreadth(){
        console.log('Breadth : '+this.breadth);
    }
    getArea(){
        console.log('Area : '+this.length*this.breadth);
    }
}
var r = new Rectangle(10,10)
r.getLength();
r.getBreadth();
r.getArea();