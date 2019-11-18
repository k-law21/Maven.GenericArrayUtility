package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {

    E[] storedArray;

    private Integer findDuplicate;

    public ArrayUtility(E[] array) {
        this.storedArray = array;

    }

    public Integer getNumberOfOccurrences( E value) {
        Integer count = 0;
        for (E x : storedArray) {
            if (x.equals(value)) {
                count++;
            }

        }
        return count;
    }


    public  Integer countDuplicatesInMerge(E[]arrayToMerge , E value){
        Integer count =0;
        for (E elem : arrayToMerge){
            if( elem.equals(value))   {
                count++;
            }
        }


        return count + getNumberOfOccurrences(value);

    }

    public E getMostCommonFromMerge(E[] arrayToMerge){

        return null;
    }

    private E[] getNewArray(Integer size){
        return (E[]) Array.newInstance(this.storedArray.getClass().getComponentType(), size);
    }

    public E[] removeValue(E value ){
        return Arrays.stream(this.storedArray)
                .filter(item -> !item.equals(value))
                .toArray(this::getNewArray);
    }


}


