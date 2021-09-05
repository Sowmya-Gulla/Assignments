class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
    getArea(){
        console.log('Area : '+this.width*this.height);
    }
}
var r = new Rectangle(4,5)
r.hieght=50;
r.getArea();