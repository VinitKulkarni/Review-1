package com.bridgelabz.Review1;

//problem2:2> Write a program to FIND HOW MANY TIMES ELEMENT IS OCCURED in a given array
public class ElementOccuranceExample {
    static void repeatedCheck(int arrayData[], int arrayCounted[], int visited){
        for(int i=0; i<arrayData.length; i++){
            int elementCount = 1;
            for(int j=i+1; j<arrayData.length; j++){
                if(arrayData[i] == arrayData[j]){
                    //match found
                    elementCount++;
                    arrayCounted[j] = visited; //-1
                }
                if(arrayCounted[i] != visited){
                    arrayCounted[i] = elementCount;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrayData[] = {1,2,3,1,5,6,5,1};
        int arrayCounted[] = new int[arrayData.length];
        int visited = -1;

        repeatedCheck(arrayData,arrayCounted,visited);

        //to display values of repeated elements
        for(int i=0; i<arrayData.length; i++){
            if(arrayCounted[i] != visited){
                System.out.println(arrayData[i] + " repeated " + arrayCounted[i] + " times");
            }
        }


    }
}
