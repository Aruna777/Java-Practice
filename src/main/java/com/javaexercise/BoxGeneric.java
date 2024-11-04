package com.javaexercise;

public class BoxGeneric<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
     return value;
    }

    public static void main(String[]args){
        BoxGeneric<Integer> IntegerBOX = new BoxGeneric<>();
        IntegerBOX.setValue(1);
        System.out.println("Elements in the integerBox: " +IntegerBOX.getValue());

        BoxGeneric<String> StringBox = new BoxGeneric<>();
        StringBox.setValue("Hola");
        System.out.println("Elements in StringBox: " +StringBox.getValue());
    }
}
