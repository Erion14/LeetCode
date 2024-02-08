class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
         double fahrenheit = (celsius * 1.80) + 32;
        double[] temparray = new double[2];
        temparray[0] = kelvin;
        temparray[1] = fahrenheit;

        return temparray;

        
    }
}