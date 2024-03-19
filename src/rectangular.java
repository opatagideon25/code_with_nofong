public class rectangular {
    //DATA FIELDS FOR RECTANGULAR OBJECTS
    double length=1.0;//default length
    double breadth=1.0;
    double height=1.0;
    //DEFAULT CONSTRUCTOR
    rectangular(){}
    //CONSTRUCTOR TO CREATE A REC BOX WITH LENGTH BREADTH GIVEN BY USER

    /**
     *
     * @param l length of the box
     * @param b breadth of the box
     */
    rectangular(double l, double b){
        length = l;
        breadth = b;
    }
    //CONSTRUCTOR TO CREATE A REC BOX WITH LENGTH, BREADTH, HEIGHT GIVEN BY USER

    /**
     *
     * @param l length of the box
     * @param b breadth of the box
     * @param h height of the box
     */
    rectangular(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }
    //METHOD TO ALLOW USER TO MODIFY THE LENGTH
    void setLength(double l){
        length = l;
    }

    double getLength(){
        return length;
    }

    double sideLeftArea(){
        return breadth*height;
    }
    double topArea(){
        return  length*breadth;
    }

}
