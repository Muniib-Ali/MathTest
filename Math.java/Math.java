
//Math Functions 
public class Math{

    public Math(){

    }

    /********************************
Developer: Faraz Ahmed
University ID: 210141722
Function: This function takes two inputs as integers and returns the sum
********************************/

public int add(int a, int b){
return a+b;
}

********************************
Developer: Muniib Ali
University ID: 200103424
Function: This function takes two inputs and returns the larger one
********************************
public int max(int a, int b){
if(a > b){
return a;
} else {
return b;
}
}

********************************
Developer: Muniib Ali
University ID: 200103424
Function: This function takes two inputs  and returns the smaller one
********************************

public int min(int a, int b){
if(a > b){
return b;
} else {
return a;
}
}

/********************************
Developer: Lena Akhter
University ID: 210108596
Function: This function takes two inputs as integers and return the result of a modulus division
********************************/
public int mod (int a, int b) {
    int modres= a % b;
    return modres;
}


/********************************
Developer: Faraz Ahmed
University ID: 210141722
Function: This function takes two inputs as integers and returns the subtraction.
********************************/

public int divide(int a , int b){
return a/b;
}

/********************************
Developer: Faraz Ahmed
University ID: 210141722
Function: This function tests the implementation of add method.
********************************/
public void addTest(){
    Math obj = new Math();
    int result = obj.add(1,3);
    if(result==4){
System.out.print("Correct Implementation");
    }
    else{
System.out.print("Error in Implementation");
    }
}

/********************************
Developer: Faraz Ahmed
University ID: 210141722
Function: This function tests the implementation of max method.
********************************/
public void maxTest(){
    Math obj = new Math();
    boolean result = obj.max(1,3);

    if (!result){
        System.out.print("Correct Implementation");
    }
    else{
System.out.print("Error in Implementation");
    }
    
}

/********************************
Developer: Hasnain Ali
University ID: 200072061
Function: This function multipies 2 integers.
********************************/
public int Multi(int x , int y){
return x*y;
}

}