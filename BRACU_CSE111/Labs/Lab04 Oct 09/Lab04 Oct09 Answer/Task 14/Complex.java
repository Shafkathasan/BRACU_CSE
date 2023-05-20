class Complex {
    private double realPart, imaginaryPart;
    
    public Complex() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }
    
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
    public Complex add (Complex otherNumber) {
        Complex newComplex = new Complex();
        
        newComplex.realPart = realPart + otherNumber.realPart;
        newComplex.imaginaryPart = imaginaryPart + otherNumber.imaginaryPart;
        
        return newComplex;
    }
    
    public Complex subtract (Complex otherNumber) {
        Complex newComplex = new Complex();
        
        newComplex.realPart = realPart - otherNumber.realPart;
        newComplex.imaginaryPart = imaginaryPart - otherNumber.imaginaryPart;
        
        return newComplex;
    }
    
    public Complex multiply (Complex otherNumber) {
        Complex newComplex = new Complex();
        
        newComplex.realPart = realPart * otherNumber.realPart - imaginaryPart * otherNumber.imaginaryPart;
        newComplex.imaginaryPart = realPart * otherNumber.imaginaryPart + otherNumber.realPart * imaginaryPart;
        
        return newComplex;
    }
    
    public Complex divide (Complex otherNumber) {
        Complex newComplex = new Complex();
        
        double numeratorLeftRealPart = realPart;
        double numeratorLeftImaginaryPart = imaginaryPart;
        
        double numeratorRightRealPart = otherNumber.realPart;
        double numeratorRightImaginaryPart = -otherNumber.imaginaryPart;
        
        double denominatorRealPart = otherNumber.realPart * otherNumber.realPart;
        double denominatorImaginaryPart = otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        
        Complex leftComplex = new Complex(numeratorLeftRealPart, numeratorLeftImaginaryPart);
        Complex rightComplex = new Complex(numeratorRightRealPart, numeratorRightImaginaryPart);
        
        Complex numeratorComplex = leftComplex.multiply(rightComplex);
        double denominator = denominatorRealPart + denominatorImaginaryPart;
        
        newComplex.realPart = numeratorComplex.realPart / denominator;
        newComplex.imaginaryPart = numeratorComplex.imaginaryPart / denominator;
        
        return newComplex;
    }
    
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    
    public double getRealPart() {
        return realPart;
    }
    
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    
    public String toString() {
        return String.format("%.2f",realPart) + " + (" + String.format("%.2f",realPart) + "i)";
    }
}