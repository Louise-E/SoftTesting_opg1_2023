public class TempConverter {
    public float converter(float temp, String unit){
        if(unit.equals("fahrenheit")){
            return (temp - 32) * 5/9;
        } else if(unit.equals("celsius")){
            return (temp * 9/5) + 32;
        } else {
            return 0;
        }

    }

}
