public class Complex {
    
    public static final Complex Zero = new Complex();
    public static final Complex I = new Complex(0, 1);
    private double _Real, _Imag;
    
    public Complex() {
        this._Real = 0;
        this._Imag = 0;
    }
    public Complex(double x) {
        this._Real = x;
        this._Imag = 0;
    }
    public Complex(double x, double y) {
        this._Real = x;
        this._Imag = y;
    }
    
    public void setReal(double x) {
        this._Real = x;
    }
    public double getReal() {
        return _Real;
    }
    
    public void setImag(double y) {
        this._Imag = y;
    }
    public double getImag() {
        return _Imag;
    }
    
    @Override
    public String toString() {
        String str;
        double x = _Real;
        double y = _Imag;
        if(x != 0) {
            str = String.format("%.2f", x);
            if(y > 0) {
                str = str + String.format("+%.2fi", y);
            }else if(y < 0) {
                str = str + String.format("%.2fi", y);
            }
        }else {
            if(y != 0) {
                str = String.format("%.2fi", y);
            }else {
                str = "0";
            }
        }
        return str;
    }
    
    public Complex add(double x) {
        return new Complex(_Real + x, _Imag);
    }
    public Complex add(Complex z) {
        return new Complex(_Real + z.getReal(), _Imag + z.getImag());
    }
    
    public Complex subtract(double x) {
        return new Complex(_Real - x, _Imag);
    }    
    public Complex subtract(Complex z) {
        return new Complex(_Real - z.getReal(), _Imag - z.getImag());
    }
    
    public Complex multiply(double x) {
        return new Complex(_Real*x, _Imag*x);
    }
    public Complex multiply(Complex z) {
        double x1 = _Real;
        double y1 = _Imag;
        double x2 = z._Real;
        double y2 = z._Imag;
        return new Complex(x1*x2-y1*y2, x1*y2+x2*y1);
    }
    
    public Complex divide(double x) {
        return new Complex(_Real/x, _Imag/x);
    }
    public Complex divide(Complex z) {
        double x1 = _Real;
        double y1 = _Imag;
        double x2 = z._Real;
        double y2 = z._Imag;
        double d = x2*x2 + y2*y2;
        return new Complex((x1*x2 + y1*y2)/d, (y1*x2 - y2*x1)/d);
        
    }
    
    public double abs() {
        return Math.sqrt(_Real*_Real + _Imag*_Imag);
    }
    
    public double phase() {
        return (Math.atan2(_Imag, _Real))*180/Math.PI;
    }
    
    public Complex conj() {
        return new Complex(_Real, -_Imag);
    }
    
}