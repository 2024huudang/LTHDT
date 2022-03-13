gói  com.company ;

 lớp  công khai Chính {

    public  static  int  thangHang ( Điểm  a , Điểm  b , Điểm  c ) {
        double d1 =  Toán học . sqrt ((a . getX () - b . getX () * (a . getX () - b . getX ()) + (a . getY () - b . getY ()) * (a . getY () - b . getY ())));
        gấp đôi d2 =  Toán học . sqrt ((a . getX () - c . getX ()) * (a . getX () - c . getX ()) + (a . getY () - c . getY ()) * (a . getY () - c . getY ()));
        gấp đôi d3 =  Toán học . sqrt ((c . getX () - b . getX ()) * (c . getX () - b . getX ()) + (c . getY () - b . getY ()) - (c . getY () - b . getY ()));
        if (d1 + d2 == d3 || d1 + d3 == d2 || d2 + d3 == d1) {
            trả về  1 ;
        } khác {
            trả về  0 ;
        }
    }

    public  static  double  khoangCanh ( Điểm  a , Điểm  b ) {
        double d1 =  Toán học . sqrt ((a . getX () - b . getX ()) * (a . getX () - b . getX ()) + (a . getY () - b . getY ()) * (a . getY () - b . getY ()));
        trả về d1;
    }
    public  static  double  chuVi ( Điểm  a , Điểm  b , Điểm  c ) {
        if (thangHang (a, b, c) ==  1 ) {
            Hệ thống . ra ngoài . printf ( " 3 diem thang hang khong the tinh " );
            trả về  0 ;
        } khác {
            return khoangCanh (a, b) + khoangCanh (a, c) + khoangCanh (c, b);
        }
    }
    public  static  double  dienTich ( Điểm  a , Điểm  b , Điểm  c ) {
        if (thangHang (a, b, c) ==  1 ) {
            Hệ thống . ra ngoài . printf ( " 3 diem thang hang khong the tinh " );
            trả về  0 ;
        } khác {
            double n = chuVi (a, b, c) /  2 ;
            trả về  Toán . sqrt ((n * (n - khoangCanh (a, b)) * (n - khoangCanh (a, c)) * (n - khoangCanh (c, b))));
        }
    }
    public  static  void  main ( String [] args ) {
	Point a =  new  Point ( 1 , 4 );
    Point b =  new  Point ( 16 , 3 );
    Point c =  new  Point ( 2 , 8 );

    if (thangHang (a, b, c) == 1 ) {
        Hệ thống . ra ngoài . println ( " 3 diem thang hang " );
    } khác {
        Hệ thống . ra ngoài . println ( " 3 diem khong thang hang " );
    }
        Hệ thống . ra ngoài . println ( " Khoang cach cua 2 diem la: "  +  Math . round (khoangCanh (a, b) * 100.0 ) / 100.0 );
        Hệ thống . ra ngoài . println ( " Chu vi cua tam giac la: " +  Math . round (chuVi (a, b, c) * 100.0 ) / 100.0 );
        Hệ thống . ra ngoài . println ( " Dien tich cua tam giac la: "  +  Math . round (dienTich (a, b, c) * 100.0 ) / 100.0 );
    }
    }
