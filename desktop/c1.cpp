#include <iostream>
using namespace std;

class Point {
private:
    int x, y;
public:
    Point() : x(0), y(0) { }
    Point(int x, int y) : x(x), y(y) { }
    void setX(int x) {this -> x = x;}
    void setY(int y) {this -> y = y;}

    int getX() { return x; }
    int getY() { return y; }
};
class ThreeDPoint : public Point {
private:
    int z;
public:
    ThreeDPoint() : Point() , z(0) { }
    ThreeDPoint(int x, int y, int z) : Point(x, y), z(z) { }

    void setZ(int z) {this -> z = z;}
    int getZ() { return z; }
    void print() {
        cout << "(" << getX() << ", " << getY() << ", "<< getZ() << ")" << endl;
    }

   ThreeDPoint operator+(ThreeDPoint& v2);
};


ThreeDPoint& operator+(ThreeDPoint& v2) {
    ThreeDPoint v;
    v.setX(getX() + v2.getX());
    v.setY(getY() + v2.getY());
    v.setZ(getZ() + v2.getZ());

    return v;
}


int main() {
    ThreeDPoint p1(10, 10, 10);
    ThreeDPoint p2(10, 10, 10);
    ThreeDPoint p3;
    p3 = p1 + p2;
    p1.print();
    p2.print();
    p3.print();
}